package com.kizhyk.homework1;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        String number = createPhoneNumber(array);

        System.out.println(number);
    }

    private static String createPhoneNumber(int[] array) {
        StringBuilder s = new StringBuilder();

        Arrays.stream(array).forEach(s::append);

        return String.format("(%s) %s-%s", s.substring(0, 3), s.substring(3, 6), s.substring(6));
    }

}
