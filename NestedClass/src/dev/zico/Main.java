package dev.zico;

import dev.miles.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(101,"Samuel",2024),
                new Employee(102,"Ema",2024),
                new Employee(103,"Joy",2027),
                new Employee(104,"Tomi",2025),
                new Employee(105,"Tete",2026) ));
//        var comaprator = new EmployeeComparator<>();
//        employees.sort(comaprator);
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for(Employee e: employees){
            System.out.println(e);
        }
    }

}