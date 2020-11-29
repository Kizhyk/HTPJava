package com.kizhyk.homework7;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        printRates(new NBRBLoader());
    }

    public static void printRates(BankLoader loader) throws Exception {
        System.out.println(loader.getCurrencyRate(BankLoader.Currency.USD));
        if (loader instanceof RangeableBankLoader) {
            Date date1 = new Date(120, 10, 1);
            Date date2 = new Date();
            RangeableBankLoader range = (RangeableBankLoader) loader;
            System.out.println(range.getCurrencyRate(BankLoader.Currency.USD, date1));
            System.out.println(Arrays.toString(range.getCurrencyRate(BankLoader.Currency.USD, date1, date2)));
        }
    }
}
