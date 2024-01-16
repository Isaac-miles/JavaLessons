package dev.zico;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int[] myIntArray = {1,2,3,4,5};
//        myIntArray[4] = 50;
//        System.out.println(myIntArray.length);
//        for(int i=1; i<=myIntArray.length-1; i++){
//            System.out.println(myIntArray[i]);
//        }
        int[] newArray;
        newArray = new int[5];
        for(int i=0; i< newArray.length; i++){
            newArray[i] = newArray.length-i;
            System.out.print(newArray.length-i);
        }
        System.out.println();
        for(int element:newArray){
            System.out.print(element + " ");
        }
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is an int array");
        }
        //not a good practice but just to shwo arrays can have different types of element
        Object[] objectArray = new Object[3];
        objectArray[0] ="Hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = newArray;
    }
}