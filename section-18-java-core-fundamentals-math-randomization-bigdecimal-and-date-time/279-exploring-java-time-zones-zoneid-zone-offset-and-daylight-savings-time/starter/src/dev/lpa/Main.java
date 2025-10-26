package dev.lpa;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        System.setProperty("user.timezone", "America/Los_Angeles");

        System.out.println(ZoneId.systemDefault());

        System.out.println("Number of TMZ : " + ZoneId.getAvailableZoneIds().size());

        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.startsWith("America/N"))
                .sorted()
                .map(ZoneId::of)
                .forEach(s -> System.out.println(s.getId() + " : " + s.getRules()));

        Set<String> jdk8Zones = ZoneId.getAvailableZoneIds();
        String[] alternate = TimeZone.getAvailableIDs();
        Set<String> oldway = new HashSet<>(Set.of(alternate));

        oldway.removeAll(jdk8Zones);
        System.out.println(oldway);
        ZoneId bet = ZoneId.of("BET", ZoneId.SHORT_IDS);
        System.out.println(bet);

        Instant instantNoe = Instant.now();
        System.out.println(instantNoe);

        for(ZoneId z : List.of(
                ZoneId.of("Australia/Sydney"),
                ZoneId.of("Europe/Paris"),
                ZoneId.of("America/New_York")
        )){
            DateTimeFormatter zoneFormat = DateTimeFormatter.ofPattern("z:zzzz");
            System.out.println(z);
            System.out.println("\t"+  instantNoe.atZone(z).format(zoneFormat));
        }


//        System.out.println(LocalDate.EPOCH);

        Period timePast = Period.between(LocalDate.EPOCH, LocalDate.now());
        System.out.println(timePast );



        LocalDateTime dob2 = LocalDateTime.of(2022, 5, 5 ,10, 0);
        Duration timeSince  = Duration.between(Instant.EPOCH, dob2.toInstant(ZoneOffset.UTC));
        System.out.println(timeSince);


    }
}
