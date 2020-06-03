package com.epam.degtyarovea.lesson01.task5;

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
        NumberValidator validator = new NumberValidator();
        if (validator.isThreeDigitNumber(number)) {
            return new ThreeDigitsConverter(number);
        } else {
            throw new IllegalArgumentException("Invalid number: " + number);
        }
    }

    public int sumAllDigits() {
        return units + tens + hundreds;
    }

    public int multiplyAllDigits() {
        return units * tens * hundreds;
    }

    public int replaceHundredsWithTens() {
        return units * 100 + tens * 10 + hundreds;
    }

    public int addUnitsAtBegin() {
        return units * 1000 + originNumber;
    }
}
