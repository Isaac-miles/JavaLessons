package dev.zico;

import java.util.Arrays;

enum FlightStates implements Trackable{
    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;

    @Override
    public void track() {
        if(this !=GROUNDED){
            System.out.println("Monitoring "+ this);
        }
    }
    public  FlightStates getNextStage(){
        FlightStates[] allStages = values();
        System.out.println("allStages values "+ Arrays.toString(allStages));
        return allStages[(ordinal()+1) % allStages.length];
    }
}
record DragonFly(String name, String type)implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
};

class Satellite implements OrbitEarth{

    @Override
    public void achieveOrbit() {
        System.out.println("orbit achieved");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
    private void log(String description){
        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }
    private void logStage(FlightStates states,String desc){
        desc = states+ " : "+ desc;
        log(desc);
    }
}
interface FlightEnabled{
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
    void fly();
    default FlightStates transition(FlightStates state){
//        System.out.println("Transition not implemented on "+ getClass().getName());
//        return null;
        FlightStates nextStage = state.getNextStage();
        System.out.println("Transitioning from "+ state+ " to "+nextStage);
        return nextStage;
    }
}
interface Trackable{
     void track();
}
public abstract class Animal {
    public abstract void move();
}
