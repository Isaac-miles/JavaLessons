package dev.zico;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move(); this doesn't compile because both flightEnabled and trackable doesn't have the move method
//        tracked.move() and the type you use i.e the variable declared type determines which method you call in your code

        flier.fly();
        tracked.track();;
        flier.land();

    }
    private static void inFlightBound(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}