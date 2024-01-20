package dev.zico;

import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("MyIntArray" + Arrays.toString(myIntArray));
        System.out.println("MyIntArray" + Arrays.toString(anotherArray));
        anotherArray[0] = 10;


    }
}
