package dev.zico;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = generateRandomArray(10);
        System.out.println("before sorting" + Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntArray(new int[]{7,30,35});
        System.out.println("after sorting" + Arrays.toString(sortedArray));

    }
    public static int[] generateRandomArray(int length){
        Random random = new Random();
        int[] newArray = new int[length];

        for(int i=0; i<length; i++){
            newArray[i] = random.nextInt(20);
        }
        return  newArray;
    }
    private static int[] sortInteger(int[] array){
        System.out.println("Before sorting " + Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i =0; i<sortedArray.length-1; i++){
                if(sortedArray[i] > sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    System.out.println("----> "+ Arrays.toString(sortedArray));
                }
            }
        }
        System.out.println("----> "+ Arrays.toString(sortedArray));

        return sortedArray;
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

//        System.out.println("After sorting " + Arrays.toString(sortedArray));
        return sortedArray;
    }
}
