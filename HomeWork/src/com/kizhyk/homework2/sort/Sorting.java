package com.kizhyk.homework2.sort;

public class Sorting {

    private Sorting() {}

    /*public static void bubbleSort(int[] array) {        //первая попытка
        for (int i = 0; i < array.length - 1; i++) {      //не знаю, что за алгоритм получился,
            for (int j = i + 1; j < array.length; j++) {  //но он работает, пишется легче
                if (array[j] < array[i]) {                //чем пузырьковая и имеет такую
                    int tmp = array[i];                   //же сложность (даже меньше).
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }*/

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    public static void cocktailSort(int[] array) {
        boolean isSorted = false;
        int count = array.length - 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < count; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }

            for (int i = count - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }

            count--;
        }
    }
}