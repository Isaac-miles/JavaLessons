package dev.zico.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    //    define our init method
    @PostConstruct
    public void init() {
        System.out.println("In postConstruct doMyStartUpStuff(): "+ getClass().getSimpleName());
    }
    //    define our destroy method

    @PreDestroy
    public void destroy() {
        System.out.println("In preDestroy doMyCleanUpStuff(): "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15m everyday";
    }
}
