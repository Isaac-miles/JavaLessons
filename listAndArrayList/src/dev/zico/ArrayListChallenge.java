package dev.zico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.next())){
                case 0 ->{

                }
                default -> flag = false;
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
    private static void addItem(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by coma]:");

    }
    private  static void printActions(){
        String textBlock = """
                Available actions
                
                0-to shutdown
                1-to add item(s) to list (comma delimited list)
                2- to remove any items (comma delimited list)
                Enter a number for which action you want to do:
                 """;
        System.out.println(textBlock + " ");
    }
}
