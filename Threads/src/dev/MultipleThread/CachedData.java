package dev.MultipleThread;

import java.util.concurrent.TimeUnit;

public class CachedData {
    private volatile boolean flag = false;
    public void toggledFlag(){
        flag = !flag;
    }
     public boolean isReady(){
        return flag;
     }
    public static void main(String[] args) {
        CachedData cachedData = new CachedData();

        Thread writerThread = new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                (e).printStackTrace();
            }
            cachedData.toggledFlag();
            System.out.println("A. Flag set to "+ cachedData.isReady());
        });

        Thread readerThread = new Thread(()->{
            while (!cachedData.isReady()){
                //Busy-wait until flag becomes true
            }
            System.out.println("B. Flag is "+cachedData.isReady());
        });
        writerThread.start();
        readerThread.start();
    }
}
