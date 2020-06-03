package com.epam.degtyarovea.lesson01.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateSearch {

    private DateValidator validator = new DateValidator();

    public Calendar searchDateByDayNumber(int dayNumber) {
        if (validator.isDayInYearRange(dayNumber)) {
            return searchDate(dayNumber);
        } else {
            throw new IllegalArgumentException("You've input invalid number.");
        }
    }

    private Calendar searchDate(int dayNumber) {
        Calendar calendar = new GregorianCalendar();
        for (Month month : Month.values()) {
            if (dayNumber <= month.getDaysCount()) {
                calendar.set(Calendar.MONTH, month.ordinal());
                calendar.set(Calendar.DAY_OF_MONTH, dayNumber);
                break;
            } else {
                dayNumber -= month.getDaysCount();
            }
        }
        return calendar;
    }
}
