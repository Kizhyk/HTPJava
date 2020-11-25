package com.kizhyk.homework6;

public class Formatter {
    public static String[] split(String text, int partNumber) {
        int partLength = text.length() / partNumber - 1;
        String[] parts = new String[partNumber];

        StringBuilder builder = new StringBuilder(text);

        int step = 0;
        for (int i = 0; i < partNumber; i++) {

            while (builder.charAt(partLength - step) != ' ') {
                step++;
            }

            parts[i] = builder.substring(0, partLength - step);
            builder.delete(0, partLength - step);

            step = 0;
        }

        parts[partNumber - 1] += builder.substring(0, builder.length() - 1);

        return parts;
    }
}
