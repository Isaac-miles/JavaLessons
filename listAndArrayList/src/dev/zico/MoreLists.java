package dev.zico;

import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk", "eggs"};
        //this creates an immutable list items
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
//        list.add("yam"); throws an exception
    }
}
