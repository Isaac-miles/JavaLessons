package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type, int count){
    public GroceryItem(String name){
        this(name,"todo",1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count,name,type);
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
        ArrayList objectListBad = new ArrayList(); //no type checking, a bad way of initializing
        objectListBad.add(new GroceryItem("milk"));
        objectListBad.add("yogurt");

        ArrayList<GroceryItem> objectListGood = new ArrayList<>(); //type checking
//        objectListGood.add("his"); //compile type checking and won't compile
        objectListGood.add(new GroceryItem("milk"));
        objectListGood.add(new GroceryItem("orange"));
        objectListGood.add(new GroceryItem("butter","PRODUCE",4));
        objectListGood.set(0,new GroceryItem("rice","PROTEIN", 2));
        objectListGood.remove(1);

        System.out.println(objectListGood);
    }
}