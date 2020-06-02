package com.epam.degtyarovea.lesson01.task7;

import java.util.Scanner;

public class NumberFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number in format 'nnn.ddd': ");
        double number = scanner.nextDouble();

        NumberFormatter formatter = new NumberFormatter();
        formatter.printSwappedParts(number);
    }

    public void printSwappedParts(double number) {
        if (number >= 100 && number < 1000) {
            System.out.printf("Result: %.3f.\n", swapParts(number));
        } else {
            System.out.println("Invalid format of inputted number.");
        }
    }

    private double swapParts(double number) {
        double fractional = ((int) (number * 1000)) % 1000;
        double integer = ((int) number) / 1000.0;
        return integer + fractional;
    }
}
