package org.cs.newdateandtimeapi;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime specifiedTime = LocalTime.of(23, 7);

        System.out.println("Current time: " + now);
        System.out.println("Specified time: " + specifiedTime);

        // Time manipulation
        System.out.println("1 hour later: " + now.plusHours(1));
        System.out.println("30 minuter ago: " + now.minusMinutes(30));
    }
}
