package dev.zico;

import dev.miles.Employee;
import dev.miles.StoreEmployee;

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

        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(106,"Eddy",2015,"Ice spice"),
                new StoreEmployee(107,"Biggie",2016,"Chicken spice"),
                new StoreEmployee(108,"Helen",2017,"The spice"),
                new StoreEmployee(109,"Rose",2018,"cold ice")
        ));
        var comparator = new Employee.EmployeeComparator<>();
        storeEmployees.sort(comparator);
        for(StoreEmployee e:storeEmployees){
            System.out.println(e);
        }
    }

}