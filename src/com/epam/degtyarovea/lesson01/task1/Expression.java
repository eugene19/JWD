package com.epam.degtyarovea.lesson01.task1;

import static java.lang.StrictMath.*;

public class Expression {

    public double calculate(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * a * c))
                / (2 * a)
                - (pow(a, 3) * c)
                + pow(b, -2);
    }
}
