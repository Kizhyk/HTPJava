package com.kizhyk.homework7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class BankLoader extends SiteLoader {

    public enum Currency {
        USD("145"),
        EUR("292"),
        RUB("298");

        private String id;

        Currency(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }
    }

    public abstract double getCurrencyRate(Currency currencyName) throws Exception;

    protected abstract double handle(String content, Currency currencyName);

    public abstract void saveCurrencyRate(Currency currencyName) throws Exception;

    /*protected boolean checkPath(String path) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(path));

        if (!fileReader.readLine().equals("NBRB")) {
            throw new RuntimeException("Файл содержит курсы другого банка или не является файлом курсов валют.");
        }


    }*/
}
