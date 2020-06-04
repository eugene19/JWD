package com.epam.degtyarovea.lesson01.task2;

import java.time.MonthDay;

public class DateSearchMain {

    public static void main(String[] args) {
        int dayNumber = 32;
        DateSearch dateSearch = new DateSearch();
        MonthDay monthDay = dateSearch.searchDateByDayNumber(dayNumber, false);

        System.out.printf("Result: date is %d %s.\n",
                monthDay.getDayOfMonth(),
                monthDay.getMonth());
    }
}
