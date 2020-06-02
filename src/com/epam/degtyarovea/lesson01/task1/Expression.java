package com.epam.degtyarovea.lesson01.task1;

import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Expression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input values 'a', 'b' and 'c': ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Expression expression = new Expression();
        double result = expression.calculate(a, b, c);
        System.out.printf("Result: %.2f.\n", result);
    }

    public double calculate(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * a * c))
                / (2 * a)
                - (pow(a, 3) * c)
                + pow(b, -2);
    }
}