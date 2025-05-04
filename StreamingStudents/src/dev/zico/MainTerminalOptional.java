package dev.zico;

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
    }
}
