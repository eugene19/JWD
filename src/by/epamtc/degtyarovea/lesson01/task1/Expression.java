package by.epamtc.degtyarovea.lesson01.task1;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Expression {

    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.2;
        double c = 1.3;
        double result;

        result = calculate(a, b, c);
        System.out.printf("Result: %.2f.\n", result);
    }

    public static double calculate(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * a * c))
                / (2 * a)
                - (pow(a, 3) * c)
                + pow(b, -2);
    }
}
