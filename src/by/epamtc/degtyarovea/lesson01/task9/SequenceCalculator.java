package by.epamtc.degtyarovea.lesson01.task9;

public class SequenceCalculator {

    public static void main(String[] args) {
        System.out.printf("Result: %d.", multiplySums());
    }

    public static long multiplySums() {
        long multiplication = 1;

        for (int i = 2; i <= 10; i++) {
            multiplication *= sumNums(i);
        }
        return multiplication;
    }

    private static long sumNums(int to) {
        long sum = 0;

        for (int i = 1; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
