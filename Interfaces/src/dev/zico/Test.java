package dev.zico;

public class Test {
    public static void main(String[] args) {
        inFlightBound(new Jet());
    }
    private static void inFlightBound(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStates.GROUNDED);
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
