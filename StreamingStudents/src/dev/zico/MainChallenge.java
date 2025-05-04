package dev.zico;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainChallenge {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);
        Course jgame = new Course("J-GAME", "Creating Games in Java");

        List<Student> students =
                Stream.generate(()->Student.getRandomStudent(jsm,pym))
                .limit(5000)
                .toList();

        //using rangeClosed
        List<Student> students_ =
                IntStream.rangeClosed(1, 5000)
                        .mapToObj((s)->Student.getRandomStudent(jsm,pym))
                        .toList();

        double totalPercent = students.stream()
                .mapToDouble(s->s.getPercentComplete("JSM"))
                .reduce(0,Double::sum);

        double averagePercentage = totalPercent / students.size();
        System.out.printf("average percentage complete = %.2f%% %n ", averagePercentage);

        int topPercent = (int)(1.25 * averagePercentage);
        System.out.printf("Best Percentage Complete = %d%% %n", topPercent);


    }
}
