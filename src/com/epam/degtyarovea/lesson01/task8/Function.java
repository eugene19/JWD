package com.epam.degtyarovea.lesson01.task8;

import java.util.Map;
import java.util.TreeMap;

public class Function {

    public Map<Double, Double> calculateOnInterval(double a, double b,
                                                   double c, double step) {
        Map<Double, Double> functionValues = new TreeMap<>();
        double y;
        for (double x = a; x <= b; x += step) {
            y = (x == 15) ? (x + c) * 2 : (x - c) + 6;
            functionValues.put(x, y);
        }
        return functionValues;
    }
}
