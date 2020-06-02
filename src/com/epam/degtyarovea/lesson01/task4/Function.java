package com.epam.degtyarovea.lesson01.task4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value 'x': ");
        double x = scanner.nextDouble();

        double functionValue = new Function().getFunctionValue(x);
        System.out.printf("Function value is %.2f\n", functionValue);
    }

    public double getFunctionValue(double x) {
        return (x > 13) ? -3 / (x + 1) : -pow(x, 3) + 9;
    }
}
