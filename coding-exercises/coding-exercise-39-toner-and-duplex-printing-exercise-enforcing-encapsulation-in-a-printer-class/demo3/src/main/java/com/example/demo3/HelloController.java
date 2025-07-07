package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot REST!";
    }

//    @GetMapping("/")
//    public String home() {
//        return "This is the REST root path (not HTML)";
//    }


}
