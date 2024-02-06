package dev.miles;

import java.util.Comparator;

public class Employee {
    public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.yearStarted - o2.yearStarted;
//        return o1.getName().compareTo(o2.getName());
        }
    }


    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee(){}
    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId,name,yearStarted);
    }
}
