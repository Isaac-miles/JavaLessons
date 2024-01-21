package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk", "eggs"};
        //this creates an immutable list items
        List<String> list = List.of(items);
//        System.out.println(list);
//        System.out.println(list.getClass().getName());
//        list.add("yam"); throws an exception

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yam");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickels","pebbles","mabbles"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
