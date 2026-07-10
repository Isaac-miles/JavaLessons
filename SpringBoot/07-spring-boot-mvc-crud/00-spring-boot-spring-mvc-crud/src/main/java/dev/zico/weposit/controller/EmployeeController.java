package dev.zico.weposit.controller;

import dev.zico.weposit.entity.Employee;
import dev.zico.weposit.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }

    @GetMapping("/showForm")
    public String showEmployeeForm(Model model) {
        Employee newEmp = new Employee();
        model.addAttribute("employeeAtt", newEmp);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@Validated @ModelAttribute("employeeAtt") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employees/employee-form";
        }else{
            employeeService.saveEmployee(employee);
            return "redirect:/employees/list";
        }
    }

    @GetMapping("/updateForm")
    public String updateEmployeeForm(@RequestParam("employeeId") int id, Model model) {
        Employee theEm =  employeeService.getEmployee(id);
        model.addAttribute("employeeAtt", theEm);
        return "employees/employee-form";
    }

    @GetMapping("/deleteEmp")
    public String deleteEmployee(@RequestParam("employeeId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees/list";
    }
}
