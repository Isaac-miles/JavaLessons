package dev.zico.weposit.service;

import dev.zico.weposit.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee getEmployee(int id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
