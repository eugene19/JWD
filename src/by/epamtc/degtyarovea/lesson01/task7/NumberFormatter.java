package by.epamtc.degtyarovea.lesson01.task7;

public class NumberFormatter {

    public static void main(String[] args) {
        double number = 123.456;

        if (hasThreeDigitInIntegerAndFractional(number)) {
            System.out.printf("Result: %.3f.", swapFractionAndInteger(number));
        } else {
            System.out.printf("Invalid number: %f.", number);
        }
    }

    private static double swapFractionAndInteger(double number) {
        double newInteger = ((int) (number * 1000)) % 1000;
        double newFractional = ((int) number) / 1000.0;

        return newInteger + newFractional;
    }

    private static boolean hasThreeDigitInIntegerAndFractional(double number) {
        double minValidNumber = 100.001;
        double maxValidNumber = 999.999;

        return number >= minValidNumber && number <= maxValidNumber;
    }
}
