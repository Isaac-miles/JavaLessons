package dev.zico;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        int[] firstArray = getRandomArrays(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[5];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 2);
        System.out.println(Arrays.toString(secondArray));

        //returning a new array instead of manipulating your main array
        int[] thirdArray = getRandomArrays(7);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); //creates a new array
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
//        System.out.println(Arrays.toString(thirdArray));
//        System.out.println(Arrays.toString(fourthArray));

        //what if the length of the copied  array is greater than
        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

    }
    private static int[] getRandomArrays(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i<len; i++){
            newInt[i] = random.nextInt(50);
        }
        return newInt;
    }
}
