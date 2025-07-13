package dev.Executors;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

record Order(long orderId,String item, int qty){}
public class Challenge {
    private static final Random random = new Random();

    public static void main(String[] args) {
        ShoeWareHouse wareHouse = new ShoeWareHouse();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<Order> orderingTask = () -> {
            {
            Order newOrder = generateOrder();
            try {
                Thread.sleep(random.nextInt(500, 5000));
                wareHouse.receiveOrder(newOrder);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return newOrder;
            }
       };
        List<Callable<Order>> tasks = Collections.nCopies(15, orderingTask);
        try {
            executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();

    }


    private static Order generateOrder(){
        return new Order(
                random.nextLong(1000000,9999999),
                ShoeWareHouse.PRODUCT_LIST[random.nextInt(0,5)],
                random.nextInt(1,4));
    }
}
