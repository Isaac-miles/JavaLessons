package dev.zico;

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
            System.out.println(Math.random());
        }
    }
}
