package dev.zico.springcoredemo.common;

public class SwimCoach implements  Coach {

    public SwimCoach() {
        System.out.println("Initializing "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim 100m every day";
    }
}
