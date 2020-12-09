package com.kizhyk.homework7;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        Date date1;
        Date date2;

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            date1 = format.parse(args[0]);
            date2 = format.parse(args[1]);
        } catch (Exception e) {
            date1 = new Date(120, Calendar.DECEMBER, 2);
            date2 = new Date();
        }

        printRates(new NBRBLoader(), date1, date2);
    }

    public static void printRates(RangeableBankLoader loader, Date date1, Date date2) throws Exception {
        System.out.println(loader.getCurrencyRate(BankLoader.Currency.USD));
        System.out.println(loader.getCurrencyRate(BankLoader.Currency.USD, date1));
        System.out.println(Arrays.toString(loader.getCurrencyRate(BankLoader.Currency.USD, date1, date2)));

    }
}
