package dev.readingFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ReadingWithNIO2 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());

        Path path = Path.of("fixedWidth.txt");
        try {
            System.out.println(new String(Files.readAllBytes(path)));
            System.out.println("----------------------------------");
            System.out.println(Files.readString(path));

            Pattern p = Pattern.compile("(.{15})(.{3})(.{12})(.{8})(.{2}).*");


        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
