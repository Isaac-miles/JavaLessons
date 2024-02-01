package dev.zico;

public class Jet implements FlightEnabled,Trackable{
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+ " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " is landing ");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " is flying ");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ " coordinates are being tracked");

    }

    @Override
    public FlightStates transition(FlightStates state) {
        System.out.println(getClass().getSimpleName()+ " transitioning");
//        return FlightStates.CRUISE;
        return FlightEnabled.super.transition(state);
    }
}
