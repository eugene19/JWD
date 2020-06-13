package by.epamtc.degtyarovea.lesson01.task6;

public class LimitFinder {

    public static void main(String[] args) {
        int a1 = 12;
        int step = 32;

        long intN = findLimitForInt(a1, step);
        long longN = findLimitForLong(a1, step);

        System.out.printf("N for integer = %d, for long = %d.", intN, longN);
    }

    public static long findLimitForInt(int a1, int step) {
        int an;
        int sn;
        int previousSn = 0;
        int n = 3;

        while (true) {
            an = a1 + (n - 1) * step;
            sn = (a1 + an) * n / 2;
            if ((sn < previousSn && step > 0) || (sn > previousSn && step < 0)) {
                return n;
            }
            previousSn = sn;
            n++;
        }
    }

    public static long findLimitForLong(int a1, int step) {
        long an;
        long sn;
        long prevSn = 0;
        long n = 3;

        while (true) {
            an = a1 + (n - 1) * step;
            sn = (a1 + an) * n / 2;
            if ((sn < prevSn && step > 0) || (sn > prevSn && step < 0)) {
                return n;
            }
            prevSn = sn;
            n++;
        }
    }
}
