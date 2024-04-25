package dev.zico;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"One","Two","Three"};
        Arrays.stream(strings)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Stream.of("Six","Five","Four")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
