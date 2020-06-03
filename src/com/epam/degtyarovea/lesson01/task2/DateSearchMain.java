package com.epam.degtyarovea.lesson01.task2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateSearchMain {

    public static void main(String[] args) {
        int dayNumber = 366;
        DateSearch dateSearch = new DateSearch();
        Calendar calendar = dateSearch.searchDateByDayNumber(dayNumber);

        DateFormat dateFormat = new SimpleDateFormat("dd MMMM");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
