package com.training.d03.s03;

public enum WeekDayWithNumber {
    MONDAY(1),
    TUESDAY(2);

    // a simple property
    private final int weekIndex;

    WeekDayWithNumber(int weekIndex) {
        this.weekIndex = weekIndex;
    }

    public int getWeekIndex() {
        return weekIndex;
    }
}
