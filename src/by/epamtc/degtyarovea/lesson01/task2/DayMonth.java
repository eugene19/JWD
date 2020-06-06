package by.epamtc.degtyarovea.lesson01.task2;

public class DayMonth {
    public int day;
    public int month;

    @Override
    public String toString() {
        return String.format("%02d.%02d", day, month);
    }
}
