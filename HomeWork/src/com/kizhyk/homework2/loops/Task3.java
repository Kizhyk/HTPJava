package com.kizhyk.homework2.loops;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double base = sc.nextDouble();
            int power = sc.nextInt();

            System.out.println(elevate(base, power));
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }

    private static double elevate(double base, int power) {
        if (power < 0) {
            throw new IllegalArgumentException();
        }

        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }

}
