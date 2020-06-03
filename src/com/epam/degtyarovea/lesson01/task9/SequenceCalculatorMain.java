package com.epam.degtyarovea.lesson01.task9;

public class SequenceCalculatorMain {

    public static void main(String[] args) {
        int fromSequence = 2;
        int toSequence = 10;
        SequenceCalculator calculator = new SequenceCalculator();
        long result = calculator.multiplicationOfSum(fromSequence, toSequence);

        System.out.printf("Result: %d.\n", result);
    }
}
