package com.epam.degtyarovea.lesson01.task6;

public class LimitFinder {

    public long findLimitForInt(int a1, int step) {
        return find(a1, step, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public long findLimitForLong(int a1, int step) {
        return find(a1, step, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private long find(int a1, int step, long minRange, long maxRange) {
        double sum = 0;
        long n = 0;
        while (sum > minRange && sum < maxRange) {
            n++;
            double an = a1 + step * (n - 1);
            sum = (a1 + an) * n / 2;
        }
        return n;
    }
}
