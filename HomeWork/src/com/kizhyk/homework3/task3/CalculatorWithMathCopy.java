package com.kizhyk.homework3.task3;

public class CalculatorWithMathCopy {

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double pow(double a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        return Math.pow(a, b);
    }
}
