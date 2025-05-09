package dev.zico;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainTerminalOptional {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass");
        Course pym = new Course("PYM", "Python Masterclass");

        List<Student> students =
                Stream.generate(()->Student.getRandomStudent(jsm,pym))
                        .limit(1000)
                        .toList();

        int minAge = 18;
        students.stream()
                .filter(s-> s.getAge() <= minAge)
                .findAny()
                .ifPresentOrElse(student -> System.out.printf("Student %d from %s is %d%n", student.getStudentId(),student.getCountryCode(),student.getAge()),
                        ()-> System.out.println("No student found under "+ minAge));

        students.stream()
                .filter(s-> s.getAge() <= minAge)
                .findFirst()
                .ifPresentOrElse(student -> System.out.printf("Student %d from %s is %d%n", student.getStudentId(),student.getCountryCode(),student.getAge()),
                        ()-> System.out.println("No student found under "+ minAge));

        students.stream()
                .filter(s -> s.getAge() <= minAge)
                .min(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(student -> System.out.printf("Student %d from %s is %d%n", student.getStudentId(),student.getCountryCode(),student.getAge()),
                        ()-> System.out.println("No student found under "+ minAge));

        students.stream()
                .filter(s -> s.getAge() <= minAge)
                .max(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(student -> System.out.printf("Student %d from %s is %d%n", student.getStudentId(),student.getCountryCode(),student.getAge()),
                        ()-> System.out.println("No student found under "+ minAge));

       // get the average age of the students under 21
        students.stream()
                .filter(s -> s.getAge() <= minAge)
                .mapToInt(Student::getAge)
                .average()
                .ifPresentOrElse(a-> System.out.printf("AVG age under 21: %.2f%n",a),()-> System.out.println("Didn't find any under  "+ minAge));

        students.stream()
                .filter(s -> s.getAge() <= minAge)
                .map(Student::getCountryCode)
                .distinct()
                .reduce((a,b)->String.join(",",a,b))
                .ifPresentOrElse(System.out::println,()-> System.out.println("Non found"));

        students.stream()
                .map(Student::getCountryCode)
                .distinct()
                .map(l->String.join(",",l))
                .filter(l->l.contains("NG"))
                .findAny()
                .ifPresentOrElse(System.out::println,()-> System.out.println("Missing NG"));

    }
}
