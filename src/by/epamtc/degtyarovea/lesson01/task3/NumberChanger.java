package by.epamtc.degtyarovea.lesson01.task3;

import static java.lang.Math.abs;

public class NumberChanger {

    public static void main(String[] args) {
        double a = -223.2;
        double b = 123.5;
        double c = -99.1;

        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = abs(a);
            b = abs(b);
            c = abs(c);
        }

        System.out.printf("Result: a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
    }
}
