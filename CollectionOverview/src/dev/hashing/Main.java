package dev.hashing;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bTest = "Hello";
        String ctest = String.join("l", "He","lo");
        String dTesxt = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText,bTest,ctest,dTesxt,eText);
        hellos.forEach(s-> System.out.println(s+": "+ s.hashCode()));


    }
}
