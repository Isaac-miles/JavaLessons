package dev.zico.thymeleaf.controller;

import dev.zico.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {
        Student theStudent = new Student();
        model.addAttribute("student", theStudent);
        model.addAttribute("countries", countries);
        return "studentForm";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent) {

        System.out.println("Student form posted "+theStudent.getFirstName()+" "+theStudent.getLastName());

        return "student-confirmation";
//        return "redirect:/showStudentForm";
    }
}
