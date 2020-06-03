package com.epam.degtyarovea.lesson01.task7;

import com.epam.degtyarovea.lesson01.task5.NumberValidator;

public class NumberFormatter {

    private NumberValidator validator = new NumberValidator();

    public double swapFractionAndInteger(double number) {
        if (validator.hasThreeDigitInIntegerAndFractional(number)) {
            return swapParts(number);
        } else {
            throw new IllegalArgumentException("Invalid number: " + number);
        }
    }

    private double swapParts(double number) {
        double fractional = ((int) (number * 1000)) % 1000;
        double integer = ((int) number) / 1000.0;
        return integer + fractional;
    }
}
