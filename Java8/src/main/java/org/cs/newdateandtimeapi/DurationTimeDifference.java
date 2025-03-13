package org.cs.newdateandtimeapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTimeDifference {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        LocalTime end = start.plusHours(4);

        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
    }
}
