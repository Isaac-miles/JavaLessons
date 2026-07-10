package dev.zico.weposit.service;

import dev.zico.weposit.dao.EmployeeDAO;
import dev.zico.weposit.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    @Autowired
    public  EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> getEmployees() {
        Comparator<Employee> sortByLastname = Comparator.comparing(Employee::getLastName).reversed();
        return employeeDAO.getEmployees()
                .stream()
                .sorted(Comparator.comparing(e -> e.getLastName().toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public Employee deleteEmployee(int id) {
        return employeeDAO.deleteEmployee(id);
    }
}
