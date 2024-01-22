package dev.zico;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysAndArrayList {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("list: " + originalList);
        System.out.println("array: "+ Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array"+ Arrays.toString(originalArray));

//        originalList.remove(0); //this won't work because the list is backed by an array
        originalList.add("four"); //this too won't work
    }
}
