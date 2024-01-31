package dev.zico;

import java.util.ArrayList;
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
        ArrayList<FlightEnabled> fliers = new ArrayList<>(); //remember an array list uses the list interface type!!
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new ArrayList<>(); // this is preferred
        betterFliers.add(bird);
        //let's add methods that demonstrates why the second option is better
        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);



    }
    private static void inFlightBound(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(ArrayList<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    }
    private static void flyFliers(ArrayList<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }
    private static void landFliers(ArrayList<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}