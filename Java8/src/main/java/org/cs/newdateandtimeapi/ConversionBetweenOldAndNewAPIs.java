package org.cs.newdateandtimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConversionBetweenOldAndNewAPIs {
    public static void main(String[] args) {
        // Date to LocalDateTime
        Date oldDate  = new Date();
        LocalDateTime newDate = oldDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Date to LocalDateTime: " + newDate);

        // LocalDateTime to Date
        LocalDateTime old = LocalDateTime.now();
        Date date = Date.from(old.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDateTime to Date: " + date);
    }
}
