package com.epam.degtyarovea.lesson01.task5;

import java.util.Scanner;

public class ThreeDigitsConverter {

    private int originNumber;
    private int units;
    private int tens;
    private int hundreds;

    private ThreeDigitsConverter(int number) {
        this.originNumber = number;
        this.units = number % 10;
        this.tens = number / 10 % 10;
        this.hundreds = number / 100 % 10;
    }

    public static ThreeDigitsConverter initConverter(int number) {
        if (number >= 100 && number <= 999) {
            return new ThreeDigitsConverter(number);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three-digit number: ");
        int number = scanner.nextInt();

        ThreeDigitsConverter converter = ThreeDigitsConverter.initConverter(number);
        if (converter != null) {
            int sum = converter.sumAllDigits();
            int multiply = converter.multiplyAllDigits();
            int hundredsSwapTens = converter.replaceHundredsWithTens();
            int unitsAtBegin = converter.addUnitsAtBegin();

            System.out.printf("Result:\n" +
                            "Sum of all digits: %d,\n" +
                            "Multiplication of all digits: %d,\n" +
                            "Number with rearranged digits of hundreds and tens: %d,\n" +
                            "Number with units digit at begin: %d.\n",
                    sum, multiply, hundredsSwapTens, unitsAtBegin);
        } else {
            System.out.println("You've input invalid number.");
        }
    }

    private int sumAllDigits() {
        return units + tens + hundreds;
    }

    private int multiplyAllDigits() {
        return units * tens * hundreds;
    }

    private int replaceHundredsWithTens() {
        return units * 100 + tens * 10 + hundreds;
    }

    private int addUnitsAtBegin() {
        return units * 1000 + originNumber;
    }
}
