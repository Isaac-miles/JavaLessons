package dev.Synchronization;

import java.util.Random;

record Order(long orderId,String item, int qty){}
public class Challenge {
    private static final Random random = new Random();
    public static void main(String[] args) {
        ShoeWareHouse wareHouse = new ShoeWareHouse();
        Thread producerThread = new Thread(()->{
            for(int j=0; j<10;j++){
                wareHouse.receiveOrder(new Order(
                        random.nextLong(1000000,9999999),
                        wareHouse.PRODUCT_LIST[random.nextInt(0,5)],
                        random.nextInt(1,4) ));
            }
        });
        producerThread.start();
        for (int i=0;i<2;i++){
            Thread consumerThread = new Thread(()->{
                for (int j=0;j<5;j++){
                    Order item = wareHouse.fulfillOrder();
                }
            });
            consumerThread.start();
        }
    }
}
