package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ann","Bob","Carol","David","Edna"};
        Collection<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("Goerge","Gary","Grace"));
        System.out.println(list);
        System.out.println(list.contains("miles"));
        list.removeIf(s->s.endsWith("ce"));
        System.out.println("_".repeat(25));
        System.out.println(list);

    }
}