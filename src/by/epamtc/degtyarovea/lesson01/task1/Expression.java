package by.epamtc.degtyarovea.lesson01.task1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Expression {

    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.2;
        double c = 1.3;
        double result;

        result = calculate(a, b, c);
        System.out.printf("Result: %.2f.", result);
    }

    public static double calculate(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * a * c))
                / (2 * a)
                - (pow(a, 3) * c)
                + pow(b, -2);
    }
}
