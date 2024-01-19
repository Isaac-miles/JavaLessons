package dev.zico;

import java.util.Arrays;

public class ArrayChalleng2 {
    public static void main(String[] args) {

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
