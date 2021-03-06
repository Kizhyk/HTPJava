package com.kizhyk.homework7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class SiteLoader {
    protected final String load(String urlToSite) throws Exception {

        StringBuilder content;
        boolean error;
        int retryCount = 0;
        do {
            content = new StringBuilder();
            error = false;
            try {
                // create a url object
                HttpURLConnection con = (HttpURLConnection) new URL(urlToSite).openConnection();

                con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
                con.setConnectTimeout(50000); //set timeout to 50 seconds
                con.setReadTimeout(50000); //set timeout to 50 seconds

                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }
            } catch (Exception e) {
                error = true;
                retryCount++;
                System.err.println("При соединении что-то пошло не так. " + e.getMessage());
            }
        } while (error && retryCount < 5);

        if (error) {
            throw new RuntimeException("Не удалось установить подключение.");
        }
        return content.toString();
    }
}

