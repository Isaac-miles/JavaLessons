package dev.zico;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListChallenge{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> listItems = new ArrayList<>();


    }
    private static void printMessage(){
        String actions = """
                Available actions
                0-to shutdown
                1-to add item(s) to list (comma delimited list)
                2-to remove any item(s) (comma delimited list)
                """;
        System.out.println(" "+ actions);
    }
    private static void addItems(ArrayList<String> listItems){

    }
}
