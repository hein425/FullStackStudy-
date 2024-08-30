package org.example;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex05 {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .filter(s -> s.contains("Europe"))
                .forEach(System.out::println);

        ZonedDateTime korea =ZonedDateTime.now();
        System.out.println(korea);

        ZonedDateTime London =ZonedDateTime.of(korea.toLocalDateTime(),
                                                ZoneId.of("Europe/London"));
        System.out.println(London);


        Duration 시차 = Duration.between(korea, London);
        System.out.println(시차);


    }
}
