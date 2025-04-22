package dev.zico;

import java.util.List;
import java.util.stream.Stream;

public class MainChallenge {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);
        Course cgm = new Course("CGIJ", "Creating Games in Java");

        List<Student> students =
                Stream.generate(()->Student.getRandomStudent(jsm,pym,cgm))
                .limit(5000)
                .toList();




    }
}
