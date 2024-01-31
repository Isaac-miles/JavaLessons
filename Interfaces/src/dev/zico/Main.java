package dev.zico;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move(); this doen't compile because both flightEnabled and trackable doesn't have the move method
//        tracked.move()
    }
}