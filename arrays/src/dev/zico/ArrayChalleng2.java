package dev.zico;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChalleng2 {
    public static void main(String[] args) {

    }
    public static int[] getInteger(int capacity){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.printf("Enter %d integer values:r", capacity);
        for(int j=0;j<array.length; j++){
            array[j] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }
    private static int[] sortIntArray(int[] array) {
        System.out.println("Before sorting " + Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    System.out.println("----> " + Arrays.toString(sortedArray));
                    flag = true; // Set flag to true if a swap is made
                }
            }
        }

        System.out.println("After sorting " + Arrays.toString(sortedArray));
        return sortedArray;
    }
}
