package com.epam.degtyarovea.lesson01.task7;

public class NumberFormatterMain {

    public static void main(String[] args) {
        double number = 123.456;
        NumberFormatter formatter = new NumberFormatter();
        double swappedNumber = formatter.swapFractionAndInteger(number);

        System.out.printf("Result: %.3f", swappedNumber);
    }
}
