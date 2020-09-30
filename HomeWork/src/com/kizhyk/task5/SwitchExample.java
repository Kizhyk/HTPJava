package com.kizhyk.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        switch (name) {
            case "Вася":
                System.out.print("Привет!\nЯ так долго тебя ждал!");
                break;

            case "Анастасия":
                System.out.print("Я тебя так долго ждал!");
                break;

            default:
                System.out.print("Добрый день, а вы кто?");
                break;
        }

        reader.close();
    }

}