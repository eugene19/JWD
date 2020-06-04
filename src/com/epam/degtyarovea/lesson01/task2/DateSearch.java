package com.epam.degtyarovea.lesson01.task2;

import java.time.Month;
import java.time.MonthDay;

public class DateSearch {

    private DateValidator validator = new DateValidator();

    public MonthDay searchDateByDayNumber(int dayNumber, boolean isLeap) {
        if (validator.isDayInYearRange(dayNumber)) {
            return searchDate(dayNumber, isLeap);
        } else {
            throw new IllegalDayOfYearException("Invalid number: " + dayNumber);
        }
    }

    private MonthDay searchDate(int dayNumber, boolean isLeap) {
        MonthDay monthDay;
        Month month = Month.JANUARY;

        while (true) {
            if (dayNumber <= month.length(isLeap)) {
                monthDay = MonthDay.of(month, dayNumber);
                break;
            } else {
                dayNumber -= month.length(isLeap);
                month = month.plus(1);
            }
        }
        return monthDay;
    }
}
