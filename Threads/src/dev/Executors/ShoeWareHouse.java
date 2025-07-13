package dev.Executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShoeWareHouse {
    private int MAX_BUFFER_SEIZE = 20;
    private List<Order> shippingItems;
    private final ExecutorService fuflillmentService;

    public static final String[] PRODUCT_LIST = {"Running Shoes", "Sandals","Boots","Slippers","High Tops"};
    public ShoeWareHouse(){
        this.shippingItems = new ArrayList<>();
        fuflillmentService = Executors.newFixedThreadPool(3);
    }

    public void shutDown(){
        fuflillmentService.shutdown();
    }
    public synchronized void receiveOrder(Order item){
        while (shippingItems.size() > MAX_BUFFER_SEIZE){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shippingItems.add(item);
        System.out.println(Thread.currentThread().getName()+" Incoming: "+ item);
        fuflillmentService.submit(this::fulfillOrder);
        notifyAll();
    }
    public synchronized Order fulfillOrder(){
        while (shippingItems.isEmpty()){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Order item = shippingItems.remove(0);
        System.out.println(Thread.currentThread().getName()+" Fulfilled "+item);
        notifyAll();
        return item;
    }
}
