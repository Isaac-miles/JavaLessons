package dev.zico.weposit.dao;

import dev.zico.weposit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    @Override
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        return employees;
    };
}
