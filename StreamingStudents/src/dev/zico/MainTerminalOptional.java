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

        int minAge = 21;
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
    }
}
