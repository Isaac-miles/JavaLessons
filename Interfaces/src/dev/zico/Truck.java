package dev.zico;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ " coordinates are being tracked");

    }
}
