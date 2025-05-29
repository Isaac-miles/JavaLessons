package dev.zico;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int maxMinusFive = Integer.MAX_VALUE - 5;
//        for(int j=0, id=maxMinusFive; j<10; id = Math.incrementExact(id), j++){
//            System.out.printf("Assigning id %, d%n", id);
//        }

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println(Math.abs((long) Integer.MIN_VALUE));

        System.out.println("MAx = "+ Math.max(10,-10));
        System.out.println("Min = "+ Math.min(10.00002, 10.001f));

// will always round up if the decimal value is 5+ and down if its below 5
        System.out.println("Rounding Down = "+ Math.round(10.2));
        System.out.println("Rounding Up = "+ Math.round(10.8));
        System.out.println("Rounding ? = "+ Math.round(10.5));

//  use floor and ceil for specific behavior
        System.out.println("Floor = "+ Math.floor(10.8)); //will always round down irrespective
        System.out.println("Ceil = "+ Math.ceil(10.2)); //will always round up irrespective

        System.out.println("Square root of 100 "+ Math.sqrt(100));
        System.out.println("2 to the third power (2*2*2) = "+ Math.pow(2,3));
        System.out.println("10 to the fifth power  = "+ Math.pow(10,5));

        for (int i=0; i < 10; i++){
            System.out.printf("%1$d = %1$c%n",(int)(Math.random()*26) + 65);
        }

        System.out.println("_".repeat(30));
        Random r = new Random();
        for (int i=0; i < 10; i++){
            System.out.printf("%1$d = %1$c%n",r.nextInt(65,91));
        }

        System.out.println("_".repeat(30));
        for (int i=0; i < 10; i++){
            System.out.printf("%1$d = %1$c%n",r.nextInt((int) 'A', (int)'Z'+1));
        }

        System.out.println("_".repeat(30));
        for (int i=0; i < 10; i++){
            System.out.printf("%1$d%n",r.nextInt(-10,11));
        }

        System.out.println("_".repeat(30));
//        random streams
        r.ints()
                .limit(10)
                .forEach(System.out::println);

        System.out.println("_".repeat(30));
        r.ints(0, 10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("_".repeat(30));
        r.ints(10, 0,10)
                .forEach(System.out::println);

        System.out.println("_".repeat(30));
        r.ints(10 )
                .forEach(System.out::println);


    }
}
