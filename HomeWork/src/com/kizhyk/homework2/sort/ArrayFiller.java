package com.kizhyk.homework2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFiller {
    private static int[] createRandomArray(int sizeCeil, int elementCeil) {
        int[] array = new int[(int) (Math.random() * sizeCeil)];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * elementCeil);
        }

        return array;
    }

    private static int[] createConsoleArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please insert size:");

        int[] array = new int[Integer.parseInt(reader.readLine())];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;
    }
}