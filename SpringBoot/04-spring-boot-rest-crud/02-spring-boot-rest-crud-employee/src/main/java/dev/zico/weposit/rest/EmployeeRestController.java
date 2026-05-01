package dev.zico.weposit.rest;
import dev.zico.weposit.entity.Employee;
import dev.zico.weposit.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    private JsonMapper jsonMapper;

    public EmployeeRestController(EmployeeService employeeService, JsonMapper jsonMapper) {
        this.employeeService = employeeService;
        this.jsonMapper = jsonMapper;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @GetMapping("employee/{id}/{year}")
    public Employee getEmployee(@PathVariable("id") int id){
        Employee em = employeeService.getEmployee(id);
        if(em == null){
            throw new RuntimeException("Employee id not found "+id);
        }
        return em;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of new item ... instead of update
        employee.setId(0);
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PatchMapping("/employee/{id}")
    public Employee patchEmployee(@PathVariable int Id, @RequestBody Map<String, Object> payload){
        Employee em = employeeService.getEmployee(Id);

        //throw null exception
        if(em == null){}

        return employeeService.saveEmployee(employee);
    }
}
