package dev.SortedMaps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

record Course(String courseId,String name,String subject){}
record Purchase (String courseId,int studentId,double price, int year,int dayOfYear){
    public LocalDate purchaseDate(){
        return LocalDate.ofYearDay(year,dayOfYear);
    }
}
public class Student {
    public static int lastId = 1;
    private String name;
    private int id;
    private List<Course> courseList;

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
        id = lastId++;
    }
    public Student(String name, Course course) {
        this(name,new ArrayList<>(List.of(course)));
    }
}
