package dev.zico;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = generateRandomArray(10);
        System.out.println("before sorting" + Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray);
        System.out.println("after sorting" + Arrays.toString(unsortedArray));

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
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i =0; i<sortedArray.length; i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    System.out.println("----> "+ Arrays.toString(sortedArray));
                }
            }
        }

        return sortedArray;
    }
}
