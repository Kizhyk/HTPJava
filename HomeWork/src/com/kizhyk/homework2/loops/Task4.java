package com.kizhyk.homework2.loops;

public class Task4 {

    public static void main(String[] args) {
        int count = (int) (Math.log(Long.MAX_VALUE) / Math.log(3)); // логарифм Long.MAX_VALUE по основанию 3
        long test = 1;

        for (int i = 0; i < count; i++) {
            test *= 3;
        }

        System.out.println(test);
        System.out.println(test * 3);
    }

}