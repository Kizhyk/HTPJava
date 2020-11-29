package com.kizhyk.homework7;

import java.util.Date;

public interface DateRangeable {
    double[] multiHandle(String content, BankLoader.Currency currencyName);

    double[] getCurrencyRate(BankLoader.Currency currencyName, Date fromDate, Date tillDate) throws Exception;

    double getCurrencyRate(BankLoader.Currency currencyName, Date date) throws Exception;
}
