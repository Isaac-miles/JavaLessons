package dev.mainChallenge;

import java.util.Arrays;
import java.util.Random;

public class LambdaExpressionChallenge {
    private  static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna","Bob","Carol","David","Ed","Fred","Gary"};
        Arrays.setAll(names, i->names[i].toUpperCase());
        System.out.println("---->Transformed to uppercase");
        System.out.println(Arrays.toString(names));
    }
}
