package dev.zico;

public class Bird extends Animal implements FlightEnabled,Trackable{

    @Override
    public void move() {
        System.out.println("Moving");
    }
}
