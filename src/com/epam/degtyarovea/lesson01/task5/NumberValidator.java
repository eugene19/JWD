package com.epam.degtyarovea.lesson01.task5;

public class NumberValidator {

    private static final int MIN_THREE_DIGIT_NUMBER = 100;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;

    public boolean isThreeDigitNumber(int number) {
        return number >= MIN_THREE_DIGIT_NUMBER && number <= MAX_THREE_DIGIT_NUMBER;
    }
}
