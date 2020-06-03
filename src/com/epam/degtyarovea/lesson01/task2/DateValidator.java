package com.epam.degtyarovea.lesson01.task2;

public class DateValidator {

    private static final int FIRST_DAY_IN_YEAR = 1;
    private static final int LAST_DAY_IN_YEAR = 365;

    public boolean isDayInYearRange(int dayNumber) {
        return dayNumber >= FIRST_DAY_IN_YEAR && dayNumber <= LAST_DAY_IN_YEAR;
    }
}
