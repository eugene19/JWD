package com.epam.degtyarovea.lesson01.task1;

public class ExpressionMain {

    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.2;
        double c = 1.3;

        Expression expression = new Expression();
        double result = expression.calculate(a, b, c);
        System.out.printf("Result: %.2f.\n", result);
    }
}
