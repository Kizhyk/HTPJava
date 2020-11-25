package com.kizhyk.homework6;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class SearchMain2 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        File file = new File("HomeWork" + separator + "resources" + separator + "input.txt");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Files.copy(file.toPath(), out);

        String text = new String(out.toByteArray(), Charset.defaultCharset());
        out.close();

        System.out.println(new AsyncSearch().search(text, "война"));
        System.out.println(new AsyncSearch().search(text, "и"));
        System.out.println(new AsyncSearch().search(text, "мир"));
    }
}
