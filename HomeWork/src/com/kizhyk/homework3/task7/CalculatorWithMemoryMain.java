package com.kizhyk.homework3.task7;

import com.kizhyk.homework3.task4.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());

        System.out.println(calc.sum(4.1, calc.sum(calc.multiply(15, 7),
                calc.pow(calc.divide(28, 5), 2)))); //ладно, не очень-то и хотелось...
    }
}