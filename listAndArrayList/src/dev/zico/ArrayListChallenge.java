package dev.zico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class ArrayListChallenge{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> listItems = new ArrayList<>();
        boolean flag = true;
        while (flag){
            printMessage();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1->addItems(listItems);
                case 2->remove(listItems);
                default -> flag = false;
            }
            System.out.println(listItems);
            listItems.sort(Comparator.naturalOrder());
            System.out.println("After sorting " + listItems);

        }


    }
    private static void printMessage(){
        String actions = """
                Available actions
                0-to shutdown
                1-to add item(s) to list (comma delimited list)
                2-to remove any item(s) (comma delimited list)
                Enter a number for which action you want to do:
                """;
        System.out.println(actions+ " ");
    }
    private static void addItems(ArrayList<String> listItems){
        System.out.println("Add item(s) [separated by comma]:");
        String[] items = scanner.nextLine().split(",");
        for(String item:items){
            String trimmedItem = item.trim();
            listItems.add(trimmedItem);
        }
//        listItems.addAll(List.of(items)); this method is not efficient
    }
    private static void remove(ArrayList<String> listItems){
        System.out.println("Add remove(s) [separated by comma]:");
        String[] items = scanner.nextLine().split(",");
        for(String item:items){
            String trimmedItem = item.trim();
            listItems.remove(trimmedItem);
        }
//        listItems.addAll(List.of(items)); this method is not efficient
    }
}
