package com.epam.degtyarovea.lesson01.task6;

import java.util.Scanner;

public class LimitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 'a1' and 'step: ");
        int a1 = scanner.nextInt();
        int step = scanner.nextInt();

        LimitFinder finder = new LimitFinder();
        long intN = finder.find(a1, step, Integer.MIN_VALUE, Integer.MAX_VALUE);
        long longN = finder.find(a1, step, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("N for integer = %d, for long = %d.", intN, longN);
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
