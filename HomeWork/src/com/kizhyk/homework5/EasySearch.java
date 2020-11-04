package com.kizhyk.homework5;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        text = Librarian.cleanText(text);
        word = String.format(" %s ", word);

        int i = 0;
        long count = 0;

        while ((i = text.indexOf(word, i)) != -1) {
            i++;
            count++;
        }

        return count;
    }
}