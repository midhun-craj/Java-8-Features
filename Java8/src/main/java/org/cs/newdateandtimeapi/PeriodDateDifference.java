package org.cs.newdateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDateDifference {
    public static void main(String[] args) {
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusYears(4);

        Period period = Period.between(start, end);
        System.out.println("Period: " + period);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
