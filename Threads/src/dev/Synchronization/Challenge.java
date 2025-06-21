package dev.Synchronization;

import java.util.Random;

record Order(long orderId,String item, int qty){}
public class Challenge {
    private static final Random random = new Random();
    public static void main(String[] args) {
        ShoeWareHouse wareHouse = new ShoeWareHouse();
    }
}
