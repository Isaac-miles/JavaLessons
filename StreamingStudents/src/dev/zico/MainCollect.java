package dev.zico;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass");
        Course pym = new Course("PYM", "Python Masterclass");

        List<Student> students =
                Stream.generate(()->Student.getRandomStudent(jsm,pym))
                        .limit(1000)
                        .toList();
        Set<Student> nigerianStudents = students.stream()
                .filter(s->s.getCountryCode().equals("NG"))
                .collect(Collectors.toSet());
        System.out.println("# of Nigerian Student = "+ nigerianStudents.size());

        Set<Student> underThirty = students.stream()
                .filter(s->s.getAgeEnrolled() < 30)
                .collect(Collectors.toSet());
        System.out.println("# of Under Thirty Students = "+ underThirty.size());

        Set<Student> youngNG = new TreeSet<>(Comparator.comparing(Student::getStudentId));
        youngNG.addAll(nigerianStudents);
        youngNG.retainAll(underThirty);
        youngNG.forEach(s-> System.out.print(s.getStudentId()+" " ));
        System.out.println();

        Set<Student> youngNG2 = students.stream()
                .filter(s->s.getAgeEnrolled() < 30)
                .filter(s->s.getCountryCode().equals("NG"))
                .collect(Collectors.toSet());

        youngNG2.forEach(s-> System.out.print(s.getStudentId()+" " ));
        System.out.println();

    }
}
