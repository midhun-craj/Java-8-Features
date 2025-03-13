package org.cs.newdateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nowInIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println("Current time in UTC: " + nowInUTC);
        System.out.println("Current time in IST: " + nowInIST);
    }
}
