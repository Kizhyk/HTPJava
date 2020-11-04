package com.kizhyk.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern p = Pattern.compile("[\n\\s.\"'(]" + word + "[\\s.,?:;\"'!)]");
        Matcher m = p.matcher(text);

        int count = 0;

        while (m.find()) {
            count++;
        }

        return count;
    }
}