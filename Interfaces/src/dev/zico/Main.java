package dev.zico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move(); this doesn't compile because both flightEnabled and trackable doesn't have the move method
//        tracked.move() and the type you use i.e the variable declared type determines which method you call in your code

//        flier.fly();
//        tracked.track();;
//        flier.land();
//        inFlightBound(flier);
        inFlightBound(new Jet());

       Trackable truck = new Truck();
       truck.track();

       double kmsTraveled = 100;
       double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck traveled %.2f km or %.2f miles%n",kmsTraveled,milesTraveled);

        //using abstracted reference type which is preferred referred to as coding into an interface
        LinkedList<FlightEnabled> fliers = new LinkedList<>(); //remember an array list uses the list interface type!!
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new ArrayList<>(); // this is preferred
        betterFliers.add(bird);
        //let's add methods that demonstrates why the second option is better
        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        //here the code won't compile because our method parameters are specific to the arrayList type, but do they
        //really need to be? or let's say LinkedList, to demonstrate coding into an interface, change all the method
        //parameter type to an interface type list
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }
    private static void inFlightBound(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    }
    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}