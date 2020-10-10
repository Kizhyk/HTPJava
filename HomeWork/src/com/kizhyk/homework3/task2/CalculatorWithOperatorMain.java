package com.kizhyk.homework3.task2;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double result = calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2)));
        System.out.println(result);
    }
}
