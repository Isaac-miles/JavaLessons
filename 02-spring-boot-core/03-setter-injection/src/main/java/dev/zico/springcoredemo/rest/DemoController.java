package dev.zico.springcoredemo.rest;

import dev.zico.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired //this is optional when you only have one constructor
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
