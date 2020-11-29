package com.kizhyk.homework7;

import java.util.Date;

public abstract class RangeableBankLoader extends BankLoader {
    protected abstract double[] multiHandle(String content, BankLoader.Currency currencyName);

    public abstract double[] getCurrencyRate(BankLoader.Currency currencyName, Date fromDate, Date tillDate) throws Exception;

    public abstract double getCurrencyRate(BankLoader.Currency currencyName, Date date) throws Exception;
}
