package com.kizhyk.homework1;

public class Task4 {

    public static void main(String[] args) {

        if (sleepIn(false, true)) {
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