package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayMessageGenerator {

    public static String generateDayMessage() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return "Happy Working Hours!";
            case SATURDAY:
            case SUNDAY:
                return "Enjoy Your Weekend!";
            default:
                return "Unknown Day";
        }
    }

    public static void main(String[] args) {
        System.out.println(generateDayMessage());
    }
}