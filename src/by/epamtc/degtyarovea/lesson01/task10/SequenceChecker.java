package by.epamtc.degtyarovea.lesson01.task10;

import java.util.Scanner;

public class SequenceChecker {
    int countNumbers;
    boolean isAscending;
    boolean isSameNumbersNext;
    boolean isAlternateSign;

    public void startChecking() {
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
            int currentDigit = getNextNumber(scanner);
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
            System.out.printf("Ascending: %s,\n", isAscending);
            System.out.printf("Has the same numbers next: %s,\n", isSameNumbersNext);
            System.out.printf("Has alternative sign: %s.\n", isAlternateSign);
        } else {
            System.out.println("There is less than 2 digits.");
        }
    }

    private int getNextNumber(Scanner scanner) {
        return (scanner.hasNextInt()) ? scanner.nextInt() : 0;
    }
}