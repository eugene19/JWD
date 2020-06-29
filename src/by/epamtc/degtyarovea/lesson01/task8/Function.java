package by.epamtc.degtyarovea.lesson01.task8;

import java.util.Map;
import java.util.TreeMap;

public class Function {

    public static void main(String[] args) {
        double a = 12;
        double b = 184;
        double constant = 3;
        double step = 4;
        Map<Double, Double> functionValues;

        functionValues = calculateOnInterval(a, b, constant, step);
        System.out.printf("Result: %s.", functionValues);
    }

    public static Map<Double, Double> calculateOnInterval(double a, double b, double c, double step) {
        Map<Double, Double> functionValues = new TreeMap<>();
        double y;

        for (double x = a; x <= b; x += step) {
            y = (x == 15) ? (x + c) * 2 : (x - c) + 6;
            functionValues.put(x, y);
        }

        return functionValues;
    }
}
