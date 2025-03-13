package org.cs.newdateandtimeapi;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate specifiedDate = LocalDate.of(2025, 3,14);
        LocalDate parsedDate = LocalDate.parse("2025-03-14");

        System.out.println("Today: " + today);
        System.out.println("Specified Date: " + specifiedDate);
        System.out.println("Parsed Date: " + parsedDate);

        // Getting individual fields
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        // Date manipulation
        System.out.println("Next week: " + today.plusWeeks(1));
        System.out.println("Previous Month: " + today.minusMonths(1));
    }
}
