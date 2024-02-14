package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Ann","Bob","Dave"));
        list.forEach(System.out::println);
    }
}
