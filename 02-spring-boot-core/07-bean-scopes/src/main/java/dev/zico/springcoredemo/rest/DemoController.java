package dev.zico.springcoredemo.rest;

import dev.zico.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;
    private Coach myCoach2;

    @Autowired
     public DemoController(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("cricketCoach") Coach myCoach2) {
        System.out.println("In constructor: "+ getClass().getSimpleName());
         this.myCoach = myCoach;
         this.myCoach2 = myCoach2;
     }
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "comparing the beans; myCaoch === myCoach2 "+ (myCoach == myCoach2);
    }
}
