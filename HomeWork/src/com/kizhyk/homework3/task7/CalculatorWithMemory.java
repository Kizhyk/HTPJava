package com.kizhyk.homework3.task7;

import com.kizhyk.homework3.task6.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private final ICalculator calc;
    private double lastOperationResult = 0;
    private double memory = 0;

    public CalculatorWithMemory(ICalculator calc) {
        this.calc = calc;
    }

    public double sum(double a, double b) {
        lastOperationResult = calc.sum(a, b);
        return lastOperationResult;
    }

    public double subtract(double a, double b) {
        lastOperationResult = calc.subtract(a, b);
        return lastOperationResult;
    }

    public double multiply(double a, double b) {
        lastOperationResult = calc.multiply(a, b);
        return lastOperationResult;
    }

    public double divide(double a, double b) {
        lastOperationResult = calc.divide(a, b);
        return lastOperationResult;
    }

    public double sqrt(double a) {
        lastOperationResult = calc.sqrt(a);
        return lastOperationResult;
    }

    public double abs(double a) {
        lastOperationResult = calc.abs(a);
        return lastOperationResult;
    }

    public double pow(double a, int b) {
        lastOperationResult = calc.pow(a, b);
        return lastOperationResult;
    }

    public double getMemory() {
        double a = memory;
        memory = 0;
        return a;
    }

    public void writeMemory() {
        memory = lastOperationResult;
    }
}