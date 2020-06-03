package com.epam.degtyarovea.lesson01.task6;

public class LimitFinderMain {

    public static void main(String[] args) {
        int a1 = 12;
        int step = 32;
        LimitFinder finder = new LimitFinder();
        long intN = finder.findLimitForInt(a1, step);
        long longN = finder.findLimitForLong(a1, step);

        System.out.printf("N for integer = %d, for long = %d.", intN, longN);
    }
}
