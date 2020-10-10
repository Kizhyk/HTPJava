package com.kizhyk.homework3.task6;

import com.kizhyk.homework3.task4.CalculatorWithMathExtends;

public class CalculatorWithCounterInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterInterface calc = new CalculatorWithCounterInterface(new CalculatorWithMathExtends());

        double result = calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2)));
        System.out.println(result);
    }
}