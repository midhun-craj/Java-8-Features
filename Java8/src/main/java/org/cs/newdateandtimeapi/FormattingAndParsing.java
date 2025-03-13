package org.cs.newdateandtimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingAndParsing {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        LocalDateTime parsedDate = LocalDateTime.parse(formattedDate, formatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}
