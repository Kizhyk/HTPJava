package com.kizhyk.homework3.task6;

public class CalculatorWithCounterInterface implements ICalculator {
    private final ICalculator calc;

    private long count = 0;

    public CalculatorWithCounterInterface(ICalculator calc) {
        this.calc = calc;
    }

    public double sum(double a, double b) {
        count++;
        return calc.sum(a, b);
    }

    public double subtract(double a, double b) {
        count++;
        return calc.subtract(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return calc.multiply(a, b);
    }

    public double divide(double a, double b) {
        count++;
        return calc.divide(a, b);
    }

    public double sqrt(double a) {
        count++;
        return calc.sqrt(a);
    }

    public double abs(double a) {
        count++;
        return calc.abs(a);
    }

    public double pow(double a, int b) {
        count++;
        return calc.pow(a, b);
    }

    public long getCountOperation() {
        return count;
    }
}