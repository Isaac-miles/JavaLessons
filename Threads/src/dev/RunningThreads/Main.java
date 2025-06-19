package dev.RunningThreads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        try {
            System.out.println("Main thread is paused for one seconds");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = new Thread(()->{
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" should take 10 dots to run");
            for (int i=1;i<10;i++){
                System.out.println(". ");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("\nwhoops!! "+tName+" interrupted. ");
                }
            }
            System.out.println("\n"+tName+" completed.");
        });
        System.out.println(thread.getName()+ " starting");
        thread.start();
        System.out.println("Main thread continues running");
    }
}
