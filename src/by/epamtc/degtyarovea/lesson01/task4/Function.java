package by.epamtc.degtyarovea.lesson01.task4;

import static java.lang.Math.pow;

public class Function {

    public static void main(String[] args) {
        double x = 12.35;
        double functionValue;

        functionValue = getFunctionValue(x);
        System.out.printf("Function value is %.2f.", functionValue);
    }

    public static double getFunctionValue(double x) {
        return (x > 13) ? -3 / (x + 1) : -pow(x, 3) + 9;
    }
}
