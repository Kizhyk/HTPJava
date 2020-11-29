package com.kizhyk.homework7;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NBRBLoader extends RangeableBankLoader {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public double getCurrencyRate(Currency currencyName) throws Exception {
        return getCurrencyRate(currencyName, new Date());
    }

    @Override
    public double[] getCurrencyRate(Currency currencyName, Date fromDate, Date tillDate) throws Exception {
        String fromDateString = dateFormat.format(fromDate);
        String tillDateString = dateFormat.format(tillDate);
        String rawUrl = "https://www.nbrb.by/api/exrates/rates/dynamics/%s?startdate=%s&enddate=%s";
        String url = String.format(rawUrl, currencyName.getId(), fromDateString, tillDateString);
        return multiHandle(load(url), currencyName);
    }

    @Override
    public double getCurrencyRate(Currency currencyName, Date date) throws Exception {
        String rawUrl = "https://www.nbrb.by/api/exrates/rates/%s?ondate=%s";
        String url = String.format(rawUrl, currencyName.getId(), dateFormat.format(date));
        return handle(load(url), currencyName);
    }

    @Override
    protected double handle(String content, BankLoader.Currency currencyName) {
        int index = content.indexOf("Cur_OfficialRate") + 18;
        String curString = content.substring(index, index + 6);

        return Double.parseDouble(curString);
    }

    @Override
    public double[] multiHandle(String content, Currency currencyName) {
        Pattern p = Pattern.compile("\"Cur_OfficialRate\":(\\d+\\.\\d+)");
        Matcher m = p.matcher(content);

        LinkedList<Double> list = new LinkedList<>();
        while (m.find()) {
            list.add(Double.parseDouble(m.group(1)));
        }

        return list.stream().mapToDouble(x -> x).toArray();
    }

    @Override
    public void saveCurrencyRate(Currency currencyName) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        boolean error;
        boolean isNew = false;
        int retryCount = 0;
        do {
            path = reader.readLine();
            error = false;

            if (path.equals("")) {
                path = "NBRBRates.txt";
                isNew = true;
                break;
            }

            try {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
                    if (!fileReader.readLine().equals("NBRB")) {
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


    }


    public double[] saveCurrencyRate(Currency currencyName, Date fromDate, Date tillDate) throws Exception {
        String fromDateString = dateFormat.format(fromDate);
        String tillDateString = dateFormat.format(tillDate);
        String rawUrl = "https://www.nbrb.by/api/exrates/rates/dynamics/%s?startdate=%s&enddate=%s";
        String url = String.format(rawUrl, currencyName.getId(), fromDateString, tillDateString);
        return multiHandle(load(url), currencyName);
    }

    public double saveCurrencyRate(Currency currencyName, Date date) throws Exception {
        String rawUrl = "https://www.nbrb.by/api/exrates/rates/%s?ondate=%s";
        String url = String.format(rawUrl, currencyName.getId(), dateFormat.format(date));
        return handle(load(url), currencyName);


    }

    private void write() {

    }
}
