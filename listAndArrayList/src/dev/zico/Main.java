package dev.zico;

record GroceryItem(String name,String type, int count){
    public GroceryItem(String name){
        this(name,"todo",1);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}