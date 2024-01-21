package dev.zico;

import java.util.Arrays;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        for(int[] outer:array2){
            System.out.println(Arrays.toString(outer));
        }
        for (int i = 0; i <array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(array2[i][j]+" ");
                array2[i][j] = (i*10) + (j+1);
            }
//            System.out.println();
        }
        //using enhanced for loop
//        for (var outer : array2) {
//            for (var i : outer) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2));
        array2[2] = new int[]{10,20,30};
        System.out.println(Arrays.deepToString(array2));
    }
}
