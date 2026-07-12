package devzico.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/leaders")
    public String leaders() {
        return "leaders-board";
    }

    @GetMapping("/systems")
    public String systems() {
        return "systems-admin";
    }
}
