package dev.zico;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Course jsm = new Course("JSM","Javascript Masterclass");
        Course csharp = new Course("CSHARP","C# Masterclass");
//        Student miles = new Student ("NG",2022,28,"M",true,jsm,csharp);
//        System.out.println(miles);
//
//        miles.watchLecture("JSM",5,2,2022);
//        miles.watchLecture("CSHARP",10,7,2023);
//        System.out.println(miles);

//        Stream.generate(()->Student.getRandomStudent(jsm,csharp))
//                .limit(10)
//                .forEach(System.out::println);

        Student[] students = new Student[1000];
        Arrays.setAll(students,(i)->Student.getRandomStudent(csharp,jsm));

        var maleStudents = Arrays.stream(students)
                .filter(student -> student.getGender().equals("M"));
        System.out.println("# of male female students " + maleStudents.count());

        for(String gender: List.of("M","F","U")){
            var mysStudents = Arrays.stream(students)
                    .filter(s->s.getGender().equals(gender));
            System.out.println("# of "+ gender + "Students "+ mysStudents.count());
        }
    }
}
