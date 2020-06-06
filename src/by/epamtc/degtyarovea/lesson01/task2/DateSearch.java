package by.epamtc.degtyarovea.lesson01.task2;

public class DateSearch {

    public static void main(String[] args) {
        int dayOfYear = 365;

        printDayMonthByDayNumber(dayOfYear);
    }

    public static void printDayMonthByDayNumber(int day) {
        if (isDayInYearRange(day)) {
            DayMonth dayMonth = getDayMonthByDayNumber(day);
            System.out.printf("Result: %s.", dayMonth);
        } else {
            System.out.println("Incorrect day of year.");
        }
    }

    private static DayMonth getDayMonthByDayNumber(int day) {
        DayMonth dayMonth = new DayMonth();

        for (int month = 1; month <= 12; month++) {
            int daysInMonth = getDaysInMonth(month);
            if (day <= daysInMonth) {
                dayMonth.day = day;
                dayMonth.month = month;
                break;
            } else {
                day -= daysInMonth;
            }
        }
        return dayMonth;
    }

    private static int getDaysInMonth(int month) {
        switch (month) {
            case 2: // February
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isDayInYearRange(int dayNumber) {
        return dayNumber >= 1 && dayNumber <= 365;
    }
}
