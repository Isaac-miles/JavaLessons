package dev.zico;

import java.util.ArrayList;
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
        //anyone who expects every element in this array to be arrayed will have a problem processing this data
        System.out.println(Arrays.toString(todoItems));
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("milk"));
        objectList.add("yogurt");
    }
}