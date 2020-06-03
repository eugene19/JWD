package com.epam.degtyarovea.lesson01.task4;

public class FunctionMain {

    public static void main(String[] args) {
        double x = 12.35;
        double functionValue = new Function().getFunctionValue(x);
        System.out.printf("Function value is %.2f\n", functionValue);
    }
}
