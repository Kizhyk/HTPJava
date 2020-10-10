package com.kizhyk.homework3.task2;

import com.kizhyk.homework3.task6.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
    } //ряды мне тут расписывать как-то лениво

    public double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public double pow(double a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < abs(b) - 1; i++) {
            a *= a;
        }
        return (b < 0) ? divide(1, a) : a;
    }
}