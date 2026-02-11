package dev.zico.myspringapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World myself";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune() {
        return "Fortune today is your lucky day";
    }
}
