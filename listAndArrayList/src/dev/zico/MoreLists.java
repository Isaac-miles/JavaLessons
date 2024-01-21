package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("Third Item = " + groceries.get(2));
        if(groceries.contains("yam")){
            System.out.println("this contains the item searched for");
        }
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("first = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","eggs")); //removes the specified items
        System.out.println(groceries);

        groceries.retainAll(List.of("apple","yam","cheese")); //this method retains elements in the list
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("groceries empty = "+ groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","beans","rice"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var grocerArray = groceries.toArray(new String[groceries.size()]); //let's say you want to pass your data as array to methods that only accepts arrays instrad of lists
        System.out.println(Arrays.toString(grocerArray));
    }
}
