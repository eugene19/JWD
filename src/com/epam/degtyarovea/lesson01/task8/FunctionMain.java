package com.epam.degtyarovea.lesson01.task8;

import java.util.Map;

public class FunctionMain {

    public static void main(String[] args) {
        double a = 1;
        double b = 18;
        double c = 3;
        double step = 4;
        Function function = new Function();
        Map<Double, Double> result = function.calculateOnInterval(a, b, c, step);

        System.out.printf("Result: %s.", result);
    }
}
