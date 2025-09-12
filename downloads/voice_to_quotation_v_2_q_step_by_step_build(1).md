# V2Q — Step‑by‑Step Build (Spring Boot + Flutter + AWS Transcribe + OpenAI)

This document is the living blueprint and code scaffold for your **Voice‑to‑Quotation** app. We’ll ship it in phases. Each phase has concrete steps and paste‑ready code.

---

## Phase 0 — Prereqs (10–30 min)
- Create AWS account + IAM user with **TranscribeStreamingFullAccess** (or least‑privilege equivalent).
- Create S3 bucket (optional, for archiving audio/transcripts later).
- Generate OpenAI API key (env var: `OPENAI_API_KEY`).
- Install: JDK 21, Maven, Docker (optional), Flutter SDK.

---

## Phase 1 — Backend skeleton (WebFlux WS + Transcribe Streaming + OpenAI JSON)

### 1.1 Project structure
```
voice-to-quotation/
  backend/
    pom.xml
    src/main/java/com/example/v2q/
      App.java
      config/
        WebConfig.java
        AwsConfig.java
        OpenAiConfig.java
      ws/
        VoiceWebSocketHandler.java
        WsMessages.java
      stt/
        TranscribeStreamingService.java
      nlp/
        OpenAiExtractionService.java
      domain/
        Quotation.java
        QuotationItem.java
      util/
        JsonSchemas.java
    src/main/resources/
      application.yml
```

### 1.2 `pom.xml`
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>v2q</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>voice-to-quotation</name>

  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.3</version>
  </parent>

  <properties>
    <java.version>21</java.version>
    <aws.sdk.version>2.25.60</aws.sdk.version>
  </properties>

  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>software.amazon.awssdk</groupId>
        <artifactId>bom</artifactId>
        <version>${aws.sdk.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>

  <dependencies>
    <!-- Reactive web + websocket -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>

    <!-- Validation + Jackson -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- AWS Transcribe Streaming (SDK v2) -->
    <dependency>
      <groupId>software.amazon.awssdk</groupId>
      <artifactId>transcribestreaming</artifactId>
    </dependency>

    <!-- Lombok (optional) -->
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>

    <!-- Metrics (optional) -->
    <dependency>
      <groupId>io.micrometer</groupId>
      <artifactId>micrometer-registry-prometheus</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>
```

### 1.3 `application.yml`
```yaml
server:
  port: 8080

v2q:
  ws:
    path: /ws/voice
  stt:
    region: us-east-1
    languageCode: en-US
    sampleRate: 16000
    partialStabilization: true
    stability: medium # low|medium|high
  openai:
    baseUrl: https://api.openai.com/v1
    model: gpt-4o-mini
    timeoutMs: 8000

spring:
  codec:
    max-in-memory-size: 10MB
```

> **Secrets**: export `OPENAI_API_KEY` and AWS credentials using the default provider chain (env vars, profile, etc.).

### 1.4 `App.java`
```java
package com.example.v2q;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
  public static void main(String[] args) { SpringApplication.run(App.class, args); }
}
```

### 1.5 `config/WebConfig.java` (WebSocket route)
```java
package com.example.v2q.config;

import com.example.v2q.ws.VoiceWebSocketHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class WebConfig {
  private final VoiceWebSocketHandler voiceHandler;

  @Bean
  public HandlerMapping webSocketMapping() {
    return new SimpleUrlHandlerMapping(Map.of(
        "/ws/voice", (WebSocketHandler) voiceHandler
    ), 10);
  }

  @Bean
  public WebSocketHandlerAdapter handlerAdapter() { return new WebSocketHandlerAdapter(); }
}
```

### 1.6 `config/AwsConfig.java`
```java
package com.example.v2q.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.transcribestreaming.TranscribeStreamingAsyncClient;

@Configuration
public class AwsConfig {
  @Bean
  TranscribeStreamingAsyncClient transcribeClient(@Value("${v2q.stt.region}") String region) {
    return TranscribeStreamingAsyncClient.builder()
        .region(Region.of(region))
        .build(); // creds via default provider chain
  }
}
```

### 1.7 `config/OpenAiConfig.java`
```java
package com.example.v2q.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class OpenAiConfig {
  @Bean
  WebClient openAi(@Value("${v2q.openai.baseUrl}") String baseUrl,
                   @Value("${OPENAI_API_KEY}") String apiKey) {
    return WebClient.builder()
        .baseUrl(baseUrl)
        .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey)
        .exchangeStrategies(ExchangeStrategies.builder()
            .codecs(c -> c.defaultCodecs().maxInMemorySize(10 * 1024 * 1024))
            .build())
        .build();
  }
}
```

### 1.8 `ws/WsMessages.java`
```java
package com.example.v2q.ws;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

public class WsMessages {
  @Data @NoArgsConstructor @AllArgsConstructor
  public static class Start { @NotBlank public String type; public String sessionId; public String lang; public Integer sampleRate; }

  @Data @NoArgsConstructor @AllArgsConstructor
  public static class Stop { public String type; }

  @Data @NoArgsConstructor @AllArgsConstructor
  public static class PartialOut { public String type = "partial_transcript"; public String text; public Double stability; }

  @Data @NoArgsConstructor @AllArgsConstructor
  public static class FinalOut { public String type = "final_transcript"; public String text; public Integer startMs; public Integer endMs; }

  @Data @NoArgsConstructor @AllArgsConstructor
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public static class QuotationOut {
    public String type = "quotation_json";
    public Quotation data;

    @Data @NoArgsConstructor @AllArgsConstructor
    public static class Quotation {
      public String customerName; public String phone; public String currency;
      public List<Item> items; public Double subtotal; public Double tax; public Double total;
      public String dueDate; public String notes; public String intent; public Double confidence;
      @Data @NoArgsConstructor @AllArgsConstructor public static class Item { public String name; public String sku; public Double quantity; public Double unitPrice; public Double discount; public Double lineTotal; }
    }
  }

  @Data @NoArgsConstructor @AllArgsConstructor
  public static class ErrorOut { public String type = "error"; public String code; public String message; }
}
```

### 1.9 `stt/TranscribeStreamingService.java`
```java
package com.example.v2q.stt;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.services.transcribestreaming.TranscribeStreamingAsyncClient;
import software.amazon.awssdk.services.transcribestreaming.model.*;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class TranscribeStreamingService {
  private final TranscribeStreamingAsyncClient client;
  private final String defaultLang; private final int defaultRate; private final boolean stabilize; private final String stability;

  public TranscribeStreamingService(TranscribeStreamingAsyncClient client,
                                    @Value("${v2q.stt.languageCode}") String lang,
                                    @Value("${v2q.stt.sampleRate}") int rate,
                                    @Value("${v2q.stt.partialStabilization}") boolean stabilize,
                                    @Value("${v2q.stt.stability}") String stability) {
    this.client = client; this.defaultLang = lang; this.defaultRate = rate; this.stabilize = stabilize; this.stability = stability;
  }

  public Session start(String sessionId, String lang, Integer sampleRate) {
    var sink = Sinks.many().unicast().onBackpressureBuffer();
    Publisher<AudioStream> audioPub = Flux.from(sink.asFlux());

    var req = StartStreamTranscriptionRequest.builder()
        .languageCode(lang != null ? lang : defaultLang)
        .mediaEncoding(MediaEncoding.PCM)
        .mediaSampleRateHertz(sampleRate != null ? sampleRate : defaultRate)
        .sessionId(sessionId)
        .build();

    var handler = StartStreamTranscriptionResponseHandler.builder()
        .subscriber(event -> {
          if (event instanceof TranscriptEvent te) {
            te.transcript().results().forEach(r -> {
              boolean isPartial = Boolean.TRUE.equals(r.isPartial());
              var alt = r.alternatives().isEmpty() ? null : r.alternatives().get(0);
              if (alt != null) {
                var text = alt.transcript();
                callbacks.onTranscript.accept(new Transcript(isPartial, text, r.startTime() != null ? (int)(r.startTime()*1000) : null,
                    r.endTime() != null ? (int)(r.endTime()*1000) : null));
              }
            });
          }
        })
        .onError(e -> callbacks.onError.accept(e))
        .onComplete(() -> callbacks.onComplete.run())
        .build();

    CompletableFuture<Void> fut = client.startStreamTranscription(req, audioPub, handler);

    return new Session(sessionId, sink, fut);
  }

  public record Transcript(boolean partial, String text, Integer startMs, Integer endMs) {}

  @FunctionalInterface public interface ErrorCb { void accept(Throwable e); }
  public static class Callbacks { public java.util.function.Consumer<Transcript> onTranscript; public ErrorCb onError; public Runnable onComplete; }
  public final Callbacks callbacks = new Callbacks();

  public static class Session {
    private final String id; private final Sinks.Many<AudioStream> sink; private final CompletableFuture<Void> future;
    Session(String id, Sinks.Many<AudioStream> sink, CompletableFuture<Void> future) { this.id=id; this.sink=sink; this.future=future; }
    public void sendPcm(byte[] bytes) { sink.tryEmitNext(AudioEvent.builder().audioChunk(SdkBytes.fromByteArray(bytes)).build()); }
    public void complete() { sink.tryEmitComplete(); }
  }
}
```

> **Important**: `mediaSampleRateHertz` and `mediaEncoding=PCM` are required and must match your audio stream (16‑bit LE PCM, not WAV bytes).

### 1.10 `nlp/OpenAiExtractionService.java`
```java
package com.example.v2q.nlp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class OpenAiExtractionService {
  private final WebClient openAi;
  @Value("${v2q.openai.model}") String model;

  public Mono<Map<String,Object>> extractQuotation(String finalText) {
    var request = Map.of(
        "model", model,
        // Structured Outputs via JSON Schema
        "response_format", Map.of(
            "type", "json_schema",
            "json_schema", Map.of(
                "name", "quotation_schema",
                "schema", com.example.v2q.util.JsonSchemas.QUOTATION
            )
        ),
        "input", "Extract a quotation JSON from this text. If totals are missing, infer cautiously. Text: " + finalText
    );

    return openAi.post().uri("/responses")
        .contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromValue(request))
        .retrieve()
        .bodyToMono(Map.class)
        .map(resp -> (Map<String,Object>) ((Map<String,Object>)resp.get("output")).get("parsed") );
  }
}
```

### 1.11 `util/JsonSchemas.java`
```java
package com.example.v2q.util;

import java.util.Map;

public class JsonSchemas {
  @SuppressWarnings("unchecked")
  public static final Map<String,Object> QUOTATION = Map.of(
      "type","object",
      "properties", Map.of(
          "customerName", Map.of("type","string"),
          "phone", Map.of("type","string"),
          "currency", Map.of("type","string","default","USD"),
          "items", Map.of("type","array","items", Map.of(
              "type","object",
              "properties", Map.of(
                  "name", Map.of("type","string"),
                  "sku", Map.of("type","string"),
                  "quantity", Map.of("type","number"),
                  "unitPrice", Map.of("type","number"),
                  "discount", Map.of("type","number","default",0),
                  "lineTotal", Map.of("type","number")
              ),
              "required", java.util.List.of("name","quantity")
          )) ,
          "subtotal", Map.of("type","number"),
          "tax", Map.of("type","number"),
          "total", Map.of("type","number"),
          "dueDate", Map.of("type","string","format","date"),
          "notes", Map.of("type","string"),
          "intent", Map.of("type","string","enum", java.util.List.of("quotation","invoice","other")),
          "confidence", Map.of("type","number")
      ),
      "required", java.util.List.of("items","total")
  );
}
```

### 1.12 `domain/Quotation.java` (DTO form used for WS output)
```java
package com.example.v2q.domain;

import lombok.*;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Quotation {
  private String customerName; private String phone; private String currency;
  private List<Item> items; private Double subtotal; private Double tax; private Double total;
  private String dueDate; private String notes; private String intent; private Double confidence;

  @Data @NoArgsConstructor @AllArgsConstructor @Builder
  public static class Item { private String name; private String sku; private Double quantity; private Double unitPrice; private Double discount; private Double lineTotal; }
}
```

### 1.13 `ws/VoiceWebSocketHandler.java`
```java
package com.example.v2q.ws;

import com.example.v2q.nlp.OpenAiExtractionService;
import com.example.v2q.stt.TranscribeStreamingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.*;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class VoiceWebSocketHandler implements WebSocketHandler {
  private final TranscribeStreamingService stt;
  private final OpenAiExtractionService nlp;
  private final ObjectMapper om = new ObjectMapper();

  @Override
  public Mono<Void> handle(WebSocketSession session) {
    final String sessionId = session.getId();
    final var sttSession = stt.start(sessionId, null, null);

    stt.callbacks.onTranscript = t -> {
      try {
        WebSocketMessage out;
        if (t.partial()) {
          var json = om.writeValueAsString(new WsMessages.PartialOut("partial_transcript", t.text(), 0.85));
          out = session.textMessage(json);
        } else {
          var json = om.writeValueAsString(new WsMessages.FinalOut("final_transcript", t.text(), t.startMs(), t.endMs()));
          out = session.textMessage(json);
          // Kick JSON extraction for final segments
          nlp.extractQuotation(t.text())
              .map(data -> Map.of("type","quotation_json","data", data))
              .map(map -> session.textMessage(sneakyJson(map)))
              .onErrorResume(e -> Mono.just(session.textMessage(sneakyJson(Map.of("type","error","code","OPENAI","message", e.getMessage())))))
              .flatMap(session::send)
              .subscribe();
        }
        session.send(Mono.just(out)).subscribe();
      } catch (Exception e) { log.error("WS send error", e); }
    };

    stt.callbacks.onError = e -> {
      var json = sneakyJson(Map.of("type","error","code","STT","message", e.getMessage()));
      session.send(Mono.just(session.textMessage(json))).subscribe();
    };

    // Incoming stream: text frames (start/stop) and binary (PCM audio)
    return session.receive().doOnTerminate(sttSession::complete).flatMap(msg -> {
      if (msg.getType() == WebSocketMessage.Type.TEXT) {
        var txt = msg.getPayloadAsText();
        try {
          Map m = om.readValue(txt, Map.class);
          if ("stop".equals(m.get("type"))) sttSession.complete();
        } catch (Exception ignored) {}
        return Mono.empty();
      } else {
        ByteBuffer bb = msg.getPayload().asByteBuffer();
        byte[] bytes = new byte[bb.remaining()]; bb.get(bytes);
        sttSession.sendPcm(bytes);
        return Mono.empty();
      }
    }).then();
  }

  private String sneakyJson(Object o) { try { return om.writeValueAsString(o);} catch (Exception e) { return "{\"type\":\"error\",\"message\":\"json\"}"; } }
}
```

**Run it**
```bash
cd voice-to-quotation/backend
mvn spring-boot:run
# WS endpoint: ws://localhost:8080/ws/voice
```

---

## Phase 2 — Flutter client (mic → WS)

**Goal**: Capture mic at 16k PCM mono and stream frames over a single WS.

- Packages: `record` (mic), `web_socket_channel` (WS). On Android, set audio source VOICE_RECOGNITION; on iOS, request mic permission.

**Sketch**
```dart
// lib/services/ws_client.dart
import 'dart:convert';
import 'dart:typed_data';
import 'package:record/record.dart';
import 'package:web_socket_channel/web_socket_channel.dart';

class V2qClient {
  final channel = WebSocketChannel.connect(Uri.parse('ws://10.0.2.2:8080/ws/voice'));
  final record = AudioRecorder();

  Future<void> start() async {
    await record.start(
      encoder: AudioEncoder.pcm16bits,
      samplingRate: 16000,
      numChannels: 1,
    );
    channel.sink.add(jsonEncode({"type":"start","lang":"en-US","sampleRate":16000}));

    record.onStateChanged().listen((s){});
    record.onAmplitudeChanged(const Duration(milliseconds: 50)).listen((_){});

    record.onFrameStream(16000).listen((frame) {
      // frame.data is Int16List
      final bytes = Uint8List.view(frame.buffer);
      channel.sink.add(bytes);
    });

    channel.stream.listen((msg) { print('WS: $msg'); });
  }

  Future<void> stop() async { await record.stop(); channel.sink.add(jsonEncode({"type":"stop"})); }
}
```

---

## Phase 3 — Persistence (Postgres) & REST
- Add JPA + Postgres to store `quotation` and `quotation_item`.
- Expose `GET /api/quotations/:id` and `GET /api/quotations?sessionId=...`.

---

## Phase 4 — Security & Multi‑tenant
- JWT on WS (use `Sec-WebSocket-Protocol` header) and REST.
- Per‑tenant rate limits for audio frames.

---

## Phase 5 — UX polish
- Flutter: live captions, chips for finalized phrases, live quotation preview with editable rows.

---

## Phase 6 — Ops
- Dockerfiles, Prometheus/Grafana, CloudWatch metrics, graceful reconnect.

---

## Notes & Gotchas
- **PCM, not WAV**: send raw signed 16‑bit little‑endian PCM frames @ `mediaSampleRateHertz`.
- **Partial vs Final**: only call OpenAI on *final* segments to save tokens & reduce flapping.
- **Latency**: 20–60ms frames is a sweet spot.
- **Backpressure**: WebFlux + unicast sink prevents overrun.
- **Schema**: keep the JSON schema small; smaller prompts → faster responses.
```

