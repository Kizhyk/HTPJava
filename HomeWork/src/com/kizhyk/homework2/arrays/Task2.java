package com.kizhyk.homework2.arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}