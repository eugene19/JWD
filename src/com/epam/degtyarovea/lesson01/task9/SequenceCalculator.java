package com.epam.degtyarovea.lesson01.task9;

public class SequenceCalculator {

    public static void main(String[] args) {
        SequenceCalculator calculator = new SequenceCalculator();
        int fromSequence = 2;
        int toSequence = 10;
        long result = calculator.multiplicationOfSum(fromSequence, toSequence);
        System.out.printf("Result: %d.\n", result);
    }

    public long multiplicationOfSum(int from, int to) {
        long multiplication = 1;
        for (int i = from; i <= to; i++) {
            multiplication *= sumNums(i);
        }
        return multiplication;
    }

    private long sumNums(int to) {
        long sum = 0;
        for (int i = 1; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
