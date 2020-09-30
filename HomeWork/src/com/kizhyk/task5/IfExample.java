package com.kizhyk.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        if (name.equals("Вася")) {
            System.out.print("Привет!\nЯ так долго тебя ждал!");
        }

        if (name.equals("Анастасия")) {
            System.out.print("Я тебя так долго ждал!");
        }

        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            System.out.print("Добрый день, а вы кто?");
        }

        reader.close();
    }

}
