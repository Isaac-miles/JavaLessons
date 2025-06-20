package dev.RunningThreads;

class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("OddThread: "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("OddThread Interrupted!");
                break;
            }
        }
    }
}

class  EvenRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=2;i<=10;i++){
            System.out.println("EvenRunnable: "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("EvenRunnable Thread Interrupted!");
                break;
            }
        }
    }
}
public class Challenge {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        Runnable runnable = ()->{
                for(int i=2;i<=10;i++){
                    System.out.println("EvenRunnable: "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println("EvenRunnable Thread Interrupted!");
                        break;
                    }
                }
        };

//        Thread evenThread = new Thread(new EvenRunnable());
        Thread evenThread = new Thread(runnable);
        oddThread.start();
        evenThread.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        oddThread.interrupt();
    }
}
