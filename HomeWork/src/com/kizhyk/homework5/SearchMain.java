package com.kizhyk.homework5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class SearchMain {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        File file = new File("HomeWork" + separator + "resources" + separator + "input.txt");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Files.copy(file.toPath(), out);

        String text = new String(out.toByteArray(), Charset.defaultCharset());
        out.close();

        System.out.println(Librarian.findUnique(text));
        Librarian.printTop(text, 10);

        EasySearch e = new EasySearch();
        RegExSearch reg = new RegExSearch();

        System.out.println(e.search(text, "война"));
        System.out.println(reg.search(text, "война"));
        System.out.println(e.search(text, "и"));
        System.out.println(reg.search(text, "и"));
        System.out.println(e.search(text, "мир"));
        System.out.println(reg.search(text, "мир"));

        //Возможные различия между результатами работы
        //методов printTop(), EasySearch.search() и RegExSearch.search()
        //обусловлены недостоверными грамматическими конструкциями в тексте
    }
}