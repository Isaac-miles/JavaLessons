package dev.zico.thymeleaf.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @GetMapping("/showForm")
    public String requestForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @PostMapping("/updateForm")
    public String letsShoutDude(HttpServletRequest req, Model model){
        String theName = req.getParameter("studentName");

        theName = theName.toUpperCase();
        String result = "Yo!!, " + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping(path = "/updateFormV2", method = RequestMethod.POST)
    public String letsShoutDudeV2(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();
        String result = "Yo!! whatsup, " + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }
}
