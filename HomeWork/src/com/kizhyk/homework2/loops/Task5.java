package com.kizhyk.homework2.loops;

public class Task5 {

    public static void main(String[] args) {

        /*Наверное, можно было что-то
        нашаманить через String.format...*/

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                int a = i * j;
                System.out.printf("%d*%d=%d\t|\t", j, i, a);
            }
            System.out.println(" ");
        }

        System.out.println("\n-------------------------------------------------------\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                int a = i * j;
                System.out.printf("%d*%d=%d\t|\t", j, i, a);
            }
            System.out.println(" ");
        }
    }
}