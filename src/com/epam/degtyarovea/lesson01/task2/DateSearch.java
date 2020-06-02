package com.epam.degtyarovea.lesson01.task2;

import java.util.Scanner;

public class DateSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of day: ");
        int dayNumber = scanner.nextInt();
        if (dayNumber > 0 && dayNumber <= 365) {
            DateSearch dateSearch = new DateSearch();
            dateSearch.searchDateByDayNumber(dayNumber);
        } else {
            System.out.println("You've input invalid number.");
        }
    }

    private void searchDateByDayNumber(int dayNumber) {
        for (Month month : Month.values()) {
            if (dayNumber <= month.getCountDays()) {
                System.out.printf("Date is %d %s", dayNumber, month.getName());
                break;
            } else {
                dayNumber -= month.getCountDays();
            }
        }
    }
}
