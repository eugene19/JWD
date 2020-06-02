package com.epam.degtyarovea.lesson01.task10;

import java.util.Scanner;

public class SequenceChecker {

    int countNumbers;
    boolean isAscending;
    boolean isSameNumbersNext;
    boolean isAlternateSign;

    public static void main(String[] args) {
        SequenceChecker sequenceChecker = new SequenceChecker();
        sequenceChecker.process();
    }

    public void process() {
        setDefaultValues();
        inputSequence();
        printSequenceInfo();
    }

    private void setDefaultValues() {
        countNumbers = 0;
        isAscending = true;
        isSameNumbersNext = false;
        isAlternateSign = true;
    }

    private void inputSequence() {
        Scanner scanner = new Scanner(System.in);
        int previousDigit = 0;

        while (true) {
            int currentDigit = scanner.nextInt();
            if (currentDigit == 0) {
                break;
            }
            countNumbers++;
            if (countNumbers >= 2) {
                checkDigit(previousDigit, currentDigit);
            }
            previousDigit = currentDigit;
        }
    }

    private void checkDigit(int previous, int current) {
        if (current < previous) {
            isAscending = false;
        }
        if (current == previous) {
            isSameNumbersNext = true;
        }
        if (current < 0 == previous < 0) {
            isAlternateSign = false;
        }
    }

    private void printSequenceInfo() {
        if (countNumbers >= 2) {
            System.out.printf("Ascending: %s,\n" +
                            "Has the same numbers next: %s,\n" +
                            "Has alternative sign: %s.\n",
                    isAscending, isSameNumbersNext, isAlternateSign);
        } else {
            System.out.println("There is less than 2 digits.");
        }
    }
}
