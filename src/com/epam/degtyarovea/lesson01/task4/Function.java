package com.epam.degtyarovea.lesson01.task4;

import static java.lang.Math.pow;

public class Function {

    public double getFunctionValue(double x) {
        return (x > 13) ? -3 / (x + 1) : -pow(x, 3) + 9;
    }
}
