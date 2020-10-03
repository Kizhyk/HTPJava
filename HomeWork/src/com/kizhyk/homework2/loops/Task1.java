package com.kizhyk.homework2.loops;

public class Task1 {

    public static void main(String[] args) {
        int factorial = 1;

        try {
            int count = Integer.parseInt(args[0]);

            for (int i = 1; i <= count; i++) {
                factorial *= i;
                System.out.printf("%d * ", i);
            }

            System.out.print("= " + factorial);
        } catch (ArrayIndexOutOfBoundsException arrayException) {
            System.out.println("Insert program arguments");
        } catch (NumberFormatException numberException) {
            System.out.println("Argument should be a not-float number");
        }

    }

}
