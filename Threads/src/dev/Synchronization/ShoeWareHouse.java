package dev.Synchronization;

import java.util.ArrayList;
import java.util.List;

public class ShoeWareHouse {
    private List<Order> shippingItems;
    public final String[] PRODUCT_LIST = {"Running Shoes", "Sandals","Boots","Slippers","High Tops"};
    public ShoeWareHouse(){
        this.shippingItems = new ArrayList<>();
    }
    public synchronized void receiveOrder(Order item){
        while (shippingItems.size() > 20){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shippingItems.add(item);
        System.out.println("Incoming: "+ item);
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
        System.out.println("Fulfilled: "+item);
        notifyAll();
        return item;
    }
}
