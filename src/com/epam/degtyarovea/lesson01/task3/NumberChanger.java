package com.epam.degtyarovea.lesson01.task3;

import java.util.Scanner;

import static java.lang.Math.*;

public class NumberChanger {

    private double a;
    private double b;
    private double c;

    public NumberChanger(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value 'a', 'b' and 'c': ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        NumberChanger numberChanger = new NumberChanger(a, b, c);
        numberChanger.changeDependingOnOrdering();

        System.out.printf("Result: a = %.2f, b = %.2f, c = %.2f\n",
                numberChanger.a,
                numberChanger.b,
                numberChanger.c);
    }

    public void changeDependingOnOrdering() {
        if (a > b && b > c) {
            doubleNumbers();
        } else {
            absoluteValues();
        }
    }

    private void doubleNumbers() {
        a *= 2;
        b *= 2;
        c *= 2;
    }

    private void absoluteValues() {
        a = abs(a);
        b = abs(b);
        c = abs(c);
    }
}
