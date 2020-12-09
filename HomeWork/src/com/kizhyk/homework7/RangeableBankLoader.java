package com.kizhyk.homework7;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class RangeableBankLoader extends BankLoader {
    protected static SimpleDateFormat dateFormat;

    protected abstract double[] multiHandle(String content, BankLoader.Currency currencyName);

    public abstract double[] getCurrencyRate(BankLoader.Currency currencyName, Date fromDate, Date tillDate) throws Exception;

    public abstract double getCurrencyRate(BankLoader.Currency currencyName, Date date) throws Exception;

    public final void saveCurrencyRate(Currency currencyName, Date fromDate, Date tillDate) throws Exception {
        Pair pair = getPath(bankName);
        write(currencyName, pair.getPath(), getCurrencyRate(currencyName, fromDate, tillDate), fromDate, tillDate, pair.isNew());
    }

    public final void saveCurrencyRate(Currency currencyName, Date date) throws Exception {
        Pair pair = getPath(bankName);
        write(currencyName, pair.getPath(), getCurrencyRate(currencyName, date), date, pair.isNew());
    }

    private void write(Currency currency, String path, double[] rates, Date fromDate, Date tillDate) {
        //TODO
    }

    private void write(Currency currency, String path, double[] rates, Date fromDate, Date tillDate, boolean isNew) {
        if (!isNew) {
            write(currency, path, rates, fromDate, tillDate);
        } else {
            //TODO
        }
    }
}
