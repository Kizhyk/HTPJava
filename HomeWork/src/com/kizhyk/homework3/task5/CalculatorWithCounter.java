package com.kizhyk.homework3.task5;

import com.kizhyk.homework3.task2.CalculatorWithOperator;
import com.kizhyk.homework3.task3.CalculatorWithMathCopy;
import com.kizhyk.homework3.task4.CalculatorWithMathExtends;
import com.kizhyk.homework3.task6.ICalculator;

public class CalculatorWithCounter implements ICalculator {
    private final CalculatorWithOperator operatorCalc;
    private final CalculatorWithMathCopy copyCalc;
    private final CalculatorWithMathExtends extendsCalc;

    private final boolean isOperator;
    private final boolean isCopy;
    private final boolean isExtends;

    private long count = 0;

    public CalculatorWithCounter(CalculatorWithOperator calc) {
        this.operatorCalc = calc;
        this.copyCalc = null;
        this.extendsCalc = null;
        this.isOperator = true;
        this.isCopy = false;
        this.isExtends = false;

    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc) {
        this.copyCalc = calc;
        this.extendsCalc = null;
        this.operatorCalc = null;
        this.isOperator = false;
        this.isCopy = true;
        this.isExtends = false;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc) {
        this.extendsCalc = calc;
        this.copyCalc = null;
        this.operatorCalc = null;
        this.isOperator = false;
        this.isCopy = false;
        this.isExtends = true;
    }

    public double sum(double a, double b) {
        count++;

        if (isExtends) {
            return extendsCalc.sum(a, b);
        } else if (isCopy) {
            return copyCalc.sum(a, b);
        } else {
            return operatorCalc.sum(a, b);
        }
    }

    public double subtract(double a, double b) {
        count++;

        if (isExtends) {
            return extendsCalc.subtract(a, b);
        } else if (isCopy) {
            return copyCalc.subtract(a, b);
        } else {
            return operatorCalc.subtract(a, b);
        }
    }

    public double multiply(double a, double b) {
        count++;

        if (isExtends) {
            return extendsCalc.multiply(a, b);
        } else if (isCopy) {
            return copyCalc.multiply(a, b);
        } else {
            return operatorCalc.multiply(a, b);
        }
    }

    public double divide(double a, double b) {
        count++;

        if (isExtends) {
            return extendsCalc.divide(a, b);
        } else if (isCopy) {
            return copyCalc.divide(a, b);
        } else {
            return operatorCalc.divide(a, b);
        }
    }

    public double sqrt(double a) {
        count++;

        if (isExtends) {
            return extendsCalc.sqrt(a);
        } else if (isCopy) {
            return copyCalc.sqrt(a);
        } else {
            return operatorCalc.sqrt(a);
        }
    }

    public double abs(double a) {
        count++;

        if (isExtends) {
            return extendsCalc.abs(a);
        } else if (isCopy) {
            return copyCalc.abs(a);
        } else {
            return operatorCalc.abs(a);
        }
    }

    public double pow(double a, int b) {
        count++;

        if (isExtends) {
            return extendsCalc.pow(a, b);
        } else if (isCopy) {
            return copyCalc.pow(a, b);
        } else {
            return operatorCalc.pow(a, b);
        }
    }

    public long getCountOperation() {
        return count;
    }
}