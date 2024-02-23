package dev.challenge;

import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

    }
    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);
    }

}
