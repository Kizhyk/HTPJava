package com.kizhyk.homework1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isWeekDay = sc.nextBoolean();
        boolean isVacation = sc.nextBoolean();

        if (sleepIn(isWeekDay, isVacation)) {
            System.out.println("... (Nothing should wake a man)");
        } else {
            System.out.println("Wake up time!");
        }

    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean isSleepTime = false;

        if (weekday || vacation) {
            isSleepTime = true;
        }

        return isSleepTime;
    }

}