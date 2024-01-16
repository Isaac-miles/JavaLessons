package dev.zico;

import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {

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
