package dev.zico.weposit.dao;

import dev.zico.weposit.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();

    Employee getEmployee(int id);

    Employee saveEmployee(Employee employee);

    Employee deleteEmployee(int id);
}
