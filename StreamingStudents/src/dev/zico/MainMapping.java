package dev.zico;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainMapping {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);
        Course jgame = new Course("J-GAME", "Creating Games in Java");

        List<Student> students = IntStream
                .rangeClosed(1,1000)
                .mapToObj(s->Student.getRandomStudent(jsm,pym))
                .toList();

//the collectors method returns a collector that collects data into a map, this map gets keyed by the result of the
// function lambda we provide

        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));
        mappedStudents.forEach((k,s)-> System.out.println(k +" "+ s.size()));
    }
}
