package com.kizhyk.homework1;

public class Task6 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        String number = createPhoneNumber(array);

        System.out.println(number);
    }

    private static String createPhoneNumber(int[] array) {                //ну ладно
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",                  //могу втупую
                    array[0], array[1], array[2], array[3], array[4],
                        array[5], array[6], array[7], array[8], array[9]);
    }

}
