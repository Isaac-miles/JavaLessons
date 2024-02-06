package dev.model;

import dev.util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i=0; i < studentCount; i++){
            students.add(new Student());
        }
        students.add(new ZCOStudent());
//        printList(students);
//        printMoreList(students);
        List<ZCOStudent> zcostudents = new ArrayList<>();
        for (int i=0; i < studentCount; i++){
            zcostudents.add(new ZCOStudent());
        }
//        printList(zcostudents);
//        printMoreList(zcostudents);

        testList(new ArrayList<String>(List.of("Josiah","Joy","Isaac")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        var queryList = new QueryList<>(zcostudents);
        var matches =queryList.getMatches("course","C++");
        printMoreList(matches);

        var students2019 = QueryList.getMatches(students,"yearstarted","2019");
        printMoreList(students2019);

        //another way without specifying the type of list argument
//        var students2018 = QueryList.<Student>getMatches(new ArrayList<>(),"yearstarted","2019");

    }

    public static void printMoreList(List<? extends Student> students){

        for(var student: students){
            System.out.println(student.getYearStarted()+": "+student);
        }
        System.out.println();
    }
    public static void testList(List<?> list){
        for (var element: list){
            if(element instanceof String){
                System.out.println("String: "+ ((String) element).toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: "+ i.floatValue());
            }
        }
    }





//    public static void testList(List<String> list){
//        for(var element : list){
//            System.out.println("String: "+ element.toUpperCase());
//        }
//    }
    //these two methods overloading will clash because they have same type erasure which is the Object class
//    public static void testList(List<Integer> list){
//        for(var element : list){
//            System.out.println("Integer: "+ element.floatValue());
//        }
//    }

    //this may still not be the preferred solution
//    public static <T extends Student> void printList(List<T> students){
//
//        for(var student: students){
//            System.out.println(student.getYearStarted()+": "+student);
//        }
//        System.out.println();
//    }

}
