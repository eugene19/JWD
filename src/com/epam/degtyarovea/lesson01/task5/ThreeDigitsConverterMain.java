package com.epam.degtyarovea.lesson01.task5;

public class ThreeDigitsConverterMain {

    public static void main(String[] args) {
        int number = 222;
        ThreeDigitsConverter converter = ThreeDigitsConverter.initConverter(number);
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

    }
}
