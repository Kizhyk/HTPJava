package com.kizhyk.homework2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please insert the size.");

        int size = Integer.parseInt(reader.readLine());
        int[] array = new int[size];

        for (int i = size; i > 0; i--) {
            array[i - 1] = Integer.parseInt(reader.readLine());
        }

        reader.close();

        /*for (int i = 0; i < array.length / 2; i++) {  //second variant
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }*/

        printDW(array);
        printW(array);
        printF(array);
        printFE(array);
    }

    private static void printDW(int[] array) {
        int i = 0;

        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
    }

    private static void printW(int[] array) {
        int i = 0;

        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    private static void printF(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void printFE(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }

        //Arrays.stream(array).forEach(System.out::println);
    }
}