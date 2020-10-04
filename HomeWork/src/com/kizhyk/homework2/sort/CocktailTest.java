package com.kizhyk.homework2.sort;

import java.util.Arrays;

public class CocktailTest extends Test {

    public static void main(String[] args) {
        printChanges(array1);
        printChanges(array2);
        printChanges(array3);
        printChanges(array4);
    }

    public static void printChanges(int[] array) {
        System.out.print(Arrays.toString(array) + " -> ");
        Sorting.cocktailSort(array);
        System.out.println(Arrays.toString(array));
    }
}
