package dev.SortedMaps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    private static Map<String,Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();
    public static void main(String[] args) {
        Course jbc = new Course("jbc101","Java Bi Functions","Java");
        Course python = new Course("pyt102","Python Master Class","Python");

        addPurchase("Mary Martin",jbc,129.88);
        addPurchase("Andy Martin",jbc,120.50);
        addPurchase("Andy Martin",jbc,120.50);
        addPurchase("Joe Jones",jbc,110.50);
        addPurchase("Bill Brown",python,117.50);

        purchases.forEach((key,value)-> System.out.println(key+": "+value));
        System.out.println("-".repeat(30));
        students.forEach((key,value)-> System.out.println(key + ": "+value));


    }
    private static void addPurchase(String name, Course course,double price){
        Student existingStudent = students.get(name);
        if(existingStudent == null){
            existingStudent = new Student(name,course);
            students.put(name,existingStudent);
        }else {
            existingStudent.addCourse(course);
        }

        int day = purchases.size()+1;
        String key = course.courseId()+"_"+existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(),existingStudent.getId(),price,year,day);
        purchases.put(key,purchase);
    }
}
