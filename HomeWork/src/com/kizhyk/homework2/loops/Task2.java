package com.kizhyk.homework2.loops;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        try {
            int[] numbers = Arrays.stream(args[0].split("")).mapToInt(Integer::parseInt).toArray();
            int composition = 1;

            for (int i = 1; i < numbers.length; i++) {
                composition *= numbers[i - 1];
                System.out.printf("%d * ", numbers[i - 1]);
            }

            System.out.printf("%d = %d", numbers[numbers.length - 1], composition);
        } catch (ArrayIndexOutOfBoundsException arrayException) {
            System.out.println("Insert program arguments");
        } catch (NumberFormatException numberException) {
            System.out.println("Argument should be a not-float number");
        }
    }
}
