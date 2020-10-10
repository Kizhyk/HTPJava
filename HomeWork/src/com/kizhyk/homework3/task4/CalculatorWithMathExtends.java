package com.kizhyk.homework3.task4;

import com.kizhyk.homework3.task2.CalculatorWithOperator;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double pow(double a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        return Math.pow(a, b);
    }

}
