package com.kizhyk.homework3.task8;

import com.kizhyk.homework3.task4.CalculatorWithMathExtends;
import com.kizhyk.homework3.task6.CalculatorWithCounterInterface;
import com.kizhyk.homework3.task6.ICalculator;
import com.kizhyk.homework3.task7.CalculatorWithMemory;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterInterface(new CalculatorWithMemory(new CalculatorWithMathExtends()));

        double result = calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2)));
        System.out.println(result);

        if (calc instanceof CalculatorWithCounterInterface) {
            CalculatorWithCounterInterface extendedCalc = (CalculatorWithCounterInterface) calc;
            System.out.println(extendedCalc.getCountOperation());

            if (extendedCalc.getCalculator() instanceof CalculatorWithMemory) {
                CalculatorWithMemory extendedCalc2 = (CalculatorWithMemory) extendedCalc.getCalculator();
                extendedCalc2.writeMemory();
                System.out.println(extendedCalc2.getMemory());
            }
        }
    }
}