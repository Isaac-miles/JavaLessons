package dev.zico;

import dev.miles.Employee;
import dev.miles.EmployeeComparator;
import dev.miles.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {
    public static void main(String[] args) {
        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(106,"Eddy",2015,"Ice spice"),
                new StoreEmployee(107,"Biggie",2016,"Chicken spice"),
                new StoreEmployee(108,"Helen",2017,"The spice"),
                new StoreEmployee(109,"Rose",2018,"Cold ice")
        ));
        var c0 = new EmployeeComparator<StoreEmployee>();
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<>();

        //using local class
        class NameSort<T> implements Comparator<StoreEmployee>{

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        var c3 = new NameSort<StoreEmployee>();

        //using anonymous class
        var c4 = new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(storeEmployees,c0);
        sortIt(storeEmployees,c1);
        sortIt(storeEmployees,c2);
        sortIt(storeEmployees,c3);
        sortIt(storeEmployees,c4);
        sortIt(storeEmployees,new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }
    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator){
        System.out.println("Sorting with comparator: " + comparator.toString());
        list.sort(comparator);
        for(var employee:list){
            System.out.println(employee);
        }
    }
}
