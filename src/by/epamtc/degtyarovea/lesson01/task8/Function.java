package by.epamtc.degtyarovea.lesson01.task8;

public class Function {

    public static void main(String[] args) {
        double a = 1;
        double b = 18;
        double c = 2;
        double step = 1;
        double y;

        for (double x = a; x <= b; x += step) {
            y = calculateOnInterval(x, c);
            System.out.printf("For x = %.2f, y = %.2f.\n", x, y);
        }
    }

    public static double calculateOnInterval(double x, double c) {
        return (x == 15) ? (x + c) * 2 : (x - c) + 6;
    }
}
