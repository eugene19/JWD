package com.epam.degtyarovea.lesson01.task2;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULE(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int daysCount;

    Month(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }
}
