package dev.zico;

import java.util.Arrays;

record GroceryItem(String name,String type, int count){
    public GroceryItem(String name){
        this(name,"todo",1);
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] todoItems = new Object[3];
        todoItems[0] = new GroceryItem("buy flakes");
        todoItems[1] = new GroceryItem("cake", "food", 6);
        todoItems[2] = "5 oranges";
        System.out.println(Arrays.toString(todoItems));
    }
}