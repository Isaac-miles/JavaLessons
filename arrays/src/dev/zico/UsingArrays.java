package dev.zico;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        int[] firstArray = getRandomArrays(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

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
