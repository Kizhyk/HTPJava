package com.kizhyk.homework3.task5;

import com.kizhyk.homework3.task4.CalculatorWithMathExtends;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithMathExtends());

        double result = calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2)));
        System.out.println(result);
    }
}