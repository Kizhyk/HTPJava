package com.kizhyk.homework7;

import java.io.*;
import java.util.Date;

public abstract class BankLoader extends SiteLoader {
    protected static String bankName;

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

    static class Pair {
        private final String path;
        private final boolean isNew;

        public Pair(String path, boolean isNew) {
            this.path = path;
            this.isNew = isNew;
        }

        public String getPath() {
            return path;
        }

        public boolean isNew() {
            return isNew;
        }
    }

    public abstract double getCurrencyRate(Currency currencyName) throws Exception;

    protected abstract double handle(String content, Currency currencyName);

    protected void write(Currency currency, String path, double rate, Date date, boolean isNew) {
        if (isNew) {
            write(currency, path, rate, date);
        } else {
            //TODO
        }
    }

    private void write(Currency currency, String path, double rate, Date date) {
        //TODO
    }

    public final void saveCurrencyRate(Currency currencyName) throws Exception {
        Pair pair = getPath(bankName);
        write(currencyName, pair.getPath(), getCurrencyRate(currencyName), new Date(), pair.isNew());
    }

    protected final Pair getPath(String bankName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        boolean error;
        boolean isNew = false;
        int retryCount = 0;
        do {
            path = reader.readLine();
            error = false;

            if (path.equals("")) {
                path = bankName + "Rates.txt";
                isNew = true;
                break;
            }

            try {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
                    if (!fileReader.readLine().equals(bankName)) {
                        throw new RuntimeException("Файл содержит курсы другого банка или не является файлом курсов валют.");
                    }
                } catch (FileNotFoundException e) {
                    File file = new File(path);
                    if (!file.createNewFile()) {
                        throw new RuntimeException("Не удалось создать файл.");
                    }
                    isNew = true;
                }

            } catch (IOException e) {
                System.err.println("Некорректный путь. " + e.getMessage());
                error = true;
                retryCount++;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                error = true;
                retryCount++;
            }
        } while (error && retryCount <= 5);

        if (error) {
            throw new RuntimeException("Превышено количество попыток записи.");
        }

        return new Pair(path, isNew);
    }
}
