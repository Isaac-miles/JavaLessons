package dev.zico;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class MainFinalChallenge {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);
        Course jgame = new Course("J-GAME", "Creating Games in Java");

        int currentYear = LocalDate.now().getYear();
        List<Student> students = Stream
                .generate(()->Student.getRandomStudent((jgame,pym,jsm))
                .filter(s->s.getYearsSinceEnrolled() >= (currentYear- 4))
                .limit(10000)
                .toList();



    }
}
