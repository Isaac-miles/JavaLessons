package dev.zico;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
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

        Comparator<Student> longTermStudent = Comparator.comparing(Student::getAgeEnrolled);

        List<Student> hardWorkers = students.stream()
                .filter(s->s.getMonthsSinceActive("JSM") ==0)
                .filter(s->s.getPercentComplete("JSM")>=topPercent)
                .sorted(longTermStudent)
                .limit(10)
                .toList();

        hardWorkers.forEach(s->{
            s.addCourse(jgame);
            System.out.print(s.getStudentId()+" ");
        });
        System.out.println();

        Comparator<Student> uniqueSorted = longTermStudent.thenComparing(Student::getStudentId);

        students.stream()
                .filter(s->s.getMonthsSinceActive("JSM") ==0)
                .filter(s->s.getPercentComplete("JSM")>=topPercent)
                .sorted(longTermStudent)
                .limit(10)
//                .toList()
//                .collect(Collectors.toSet())
                .collect(()->new TreeSet<>(longTermStudent),TreeSet::add, TreeSet::addAll)
                .forEach(s->{
                s.addCourse(jgame);
                System.out.print(s.getStudentId()+" ");
        });
    }
}
