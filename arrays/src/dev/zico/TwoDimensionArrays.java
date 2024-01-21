package dev.zico;

import java.util.Arrays;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        for(int[] outer:array2){
            System.out.println(Arrays.toString(outer));
        }
    }
}
