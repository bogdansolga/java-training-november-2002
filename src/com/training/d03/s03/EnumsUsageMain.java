package com.training.d03.s03;

public class EnumsUsageMain {

    public static void main(String[] args) {
        final WeekDay[] values = WeekDay.values();
        for (WeekDay weekDay : values) {
            System.out.println(weekDay + " has the ordinal " + weekDay.ordinal());
        }

        final WeekDayWithNumber[] weekDayWithNumbers = WeekDayWithNumber.values();
        for (WeekDayWithNumber weekDayWithNumber : weekDayWithNumbers) {
            System.out.println(weekDayWithNumber + ": "
                    + weekDayWithNumber.getWeekIndex());
        }
    }
}
