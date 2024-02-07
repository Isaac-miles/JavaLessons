package dev.zico;

import dev.miles.Employee;
import dev.miles.StoreEmployee;
import org.jetbrains.annotations.NotNull;

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
                new StoreEmployee(109,"Rose",2018,"Cold ice")
        ));
        //using a local variable to access the nested inner non-static class
//        var genericEmployee = new StoreEmployee();
//        var comparator = genericEmployee.new StoreComparator<>();
        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for(StoreEmployee e:storeEmployees){
            System.out.println(e);
        }

        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<? extends StoreEmployee> list){

        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
            String lastName = "Piggy";

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName+" "+lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " "+pigLatinName;
            }

            @Override
            public int compareTo(@NotNull DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for(var employee : list){
            String name = employee.getName();
            String pigLatin = name.substring(1)+name.charAt(0)+"ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }
        newList.sort(null);
        for(var dEmployee : newList){
            System.out.println(dEmployee.originalInstance.getName()+" "+dEmployee.pigLatinName);
        }
    }

}