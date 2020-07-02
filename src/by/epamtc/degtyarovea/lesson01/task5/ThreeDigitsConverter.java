package by.epamtc.degtyarovea.lesson01.task5;

public class ThreeDigitsConverter {

    public static void main(String[] args) {
        int number = 136;

        if (isThreeDigitNumber(number)) {
            System.out.printf("Sum of all digits: %d,\n", sumOfAllDigits(number));
            System.out.printf("Multiplication of all digits: %d,\n", multiplyOfAllDigits(number));
            System.out.printf("Swapped of hundreds and tens: %d,\n", swapHundredsAndTens(number));
            System.out.printf("Number with units digit at begin: %d.\n", addUnitsAtBegin(number));
        } else {
            System.out.println("Number is not three-digit.");
        }
    }

    public static int sumOfAllDigits(int number) {
        return units(number) + tens(number) + hundreds(number);
    }

    public static int multiplyOfAllDigits(int number) {
        return units(number) * tens(number) * hundreds(number);
    }

    public static int swapHundredsAndTens(int number) {
        return units(number) * 100 + tens(number) * 10 + hundreds(number);
    }

    public static int addUnitsAtBegin(int number) {
        return units(number) * 1000 + number;
    }

    public static boolean isThreeDigitNumber(int number) {
        int minThreeDigitNumber = 100;
        int maxThreeDigitNumber = 999;
        return number >= minThreeDigitNumber && number <= maxThreeDigitNumber;
    }

    private static int units(int number) {
        return number % 10;
    }

    private static int tens(int number) {
        return number / 10 % 10;
    }

    private static int hundreds(int number) {
        return number / 100 % 10;
    }
}
