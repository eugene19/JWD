package com.epam.degtyarovea.lesson01.task3;

public class NumberChangerMain {

    public static void main(String[] args) {
        double a = -223;
        double b = 123;
        double c = -99;
        NumberChanger numberChanger = new NumberChanger(a, b, c);
        numberChanger.changeDependingOnOrdering();

        System.out.printf("Result: a = %.2f, b = %.2f, c = %.2f\n",
                numberChanger.getA(),
                numberChanger.getB(),
                numberChanger.getC());
    }
}
