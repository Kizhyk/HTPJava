package com.kizhyk.homework5;

import java.util.*;

public class Librarian {
    public static Set<String> findUnique(String text) {
        return new HashSet<>(splitIntoWords(text));
    }

    public static void printTop(String text, int amount) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : splitIntoWords(text)) {
            map.merge(s, 1, Integer::sum);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < amount; ) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (e.getValue().equals(list.get(i))) {
                    i++;
                    System.out.println(e);
                }
            }
        }
    }

    public static List<String> splitIntoWords(String text) {
        return Arrays.asList(text.split("[^a-zA-Zа-яА-Я0-9-ёЁ][^a-zA-Zа-яА-Я0-9ёЁ]*"));
    }

    public static String cleanText(String text) {
        /*StringBuilder bl = new StringBuilder(text);

        char[] trash = {'!', '\"', ':', ',', '.', '(', ')', '\'', ';', '?', '\n'};

        for (char c : trash) {
            int i = 0;
            while ((i = text.indexOf(c, i)) != -1) {
                bl.replace(i++, i, " ");
            }
        }*/

        char[] trash = {'!', '\"', ':', ',', '.', '(', ')', '\'', ';', '?', '\n'};

        for (char c : trash) {
            text = text.replace(c, ' ');
        }

        //return text.replaceAll("[!\":,.()';?\n]", " ");

        return text;
    }
}