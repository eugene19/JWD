package com.epam.degtyarovea.lesson01.task2;

public enum Month {

    JANUARY(31, "January"),
    FEBRUARY(28, "February"),
    MARCH(31, "March"),
    APRIL(30, "April"),
    MAY(31, "May"),
    JUNE(30, "June"),
    JULE(31, "Jule"),
    AUGUST(31, "August"),
    SEPTEMBER(30, "September"),
    OCTOBER(31, "October"),
    NOVEMBER(30, "November"),
    DECEMBER(31, "December");

    private int days;
    private String name;

    Month(int days, String name) {
        this.days = days;
        this.name = name;
    }

    public int getCountDays() {
        return days;
    }

    public String getName() {
        return name;
    }
}
