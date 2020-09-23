package com.kizhyk.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        if (name.equals("Вася")) {
            System.out.print("Привет!\nЯ так долго тебя ждал!");
        } else if (name.equals("Анастасия")) {
            System.out.print("Я тебя так долго ждал!");
        } else {
            System.out.print("Добрый день, а вы кто?");
        }

        reader.close();
    }

}
