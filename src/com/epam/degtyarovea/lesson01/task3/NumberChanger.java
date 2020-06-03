package com.epam.degtyarovea.lesson01.task3;

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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
