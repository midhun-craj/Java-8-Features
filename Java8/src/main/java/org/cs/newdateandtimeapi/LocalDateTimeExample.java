package org.cs.newdateandtimeapi;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime specifiedTime = LocalDateTime.of(2025, 3, 14, 23, 14, 29, 29);

        System.out.println("Current time: " + now);
        System.out.println("Specified time: " + specifiedTime);
    }
}
