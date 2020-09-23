package com.kizhyk;

public class Task2 {

    public static void main(String[] args) {

    }

    /* Методы здесь только потому,
     * что каждый раз писать a = 8 и b = 2
     * выглядит некрасиво.*/

    private static double firstOperation() {
        return 5 + 2 / 8; // результат 5, тк. без явного приведения типа 2 / 8 отбрасывает дробную часть
    }

    private static double secondOperation() {
        return (5 + 2) / 8; // результат 0, см. первую операцию. 7 / 8 = 0 без привидения
    }

    private static double thirdOperation(int b) {
        return (5 + b++) / 8; // результат 0, тк. во время работы b = 2, постинкримент
    }

    private static double fourthOperation(int a, int b) {
        return (5 + b++) / --a; // результат 1. b = 2, a = 7. 7 / 7 = 1
    }

    private static double fifthOperation(int a, int b) {
        return (5 * 2 >> b++) / --a; // результат 0, тк 10 >> 2 = 2 из-за отбрасывания остатка. 2 / 7 = 0
    }

    private static double sixthOperation(int a, int b) {
        return (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a; // результат 1. 14 < 20, значит переходим к 22 * 2 >> b++
    } // 44 >> 2 = 11   11 / 7 = 1 без приведения типа

    /*private static double seventhOperation(int a, int b) {
        return (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a; // пытаемся делить boolean на число
    }*/

    private static boolean eighthOperation(int a, int b) {
        return 6 - 2 > 3 && 12 * 12 <= 119; // false. 4 > 3(true), но 144 > 119 (false) -> false
    }

    private static boolean ninthOperation() {
        return true && false; // false
    }

}
