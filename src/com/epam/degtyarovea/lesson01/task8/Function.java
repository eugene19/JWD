package com.epam.degtyarovea.lesson01.task8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 'a', 'b', 'c' and 'step'");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double step = scanner.nextInt();

        Function function = new Function();
        Map<Double, Double> result = function.calculateOnInterval(a, b, c, step);

        for (Map.Entry<Double, Double> entry : result.entrySet()) {
            System.out.printf("For X = %.2f, Y = %.2f.\n",
                    entry.getKey(),
                    entry.getValue());
        }
    }

    public Map<Double, Double> calculateOnInterval(double a, double b, double c, double step) {
        Map<Double, Double> functionValues = new TreeMap<>();
        double y;
        for (double x = a; x <= b; x += step) {
            y = (x == 15) ? (x + c) * 2 : (x - c) + 6;
            functionValues.put(x, y);
        }
        return functionValues;
    }
}
