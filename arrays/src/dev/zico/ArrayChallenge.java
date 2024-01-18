package dev.zico;

import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {

    }
    public static int[] generteRandomArray(int length){
        Random random = new Random();
        int[] newArray = new int[length];

        for(int i=1; i<length; i++){
            newArray[i] = random.nextInt();
        }
        return  newArray;
    }
}
