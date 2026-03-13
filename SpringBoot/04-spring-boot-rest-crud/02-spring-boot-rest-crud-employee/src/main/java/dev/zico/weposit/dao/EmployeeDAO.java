package dev.zico.weposit.dao;

import dev.zico.weposit.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();
}
