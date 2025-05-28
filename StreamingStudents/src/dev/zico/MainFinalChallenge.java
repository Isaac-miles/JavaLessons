package dev.zico;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFinalChallenge {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);
        Course jgame = new Course("J-GAME", "Creating Games in Java");

        int currentYear = LocalDate.now().getYear();
        List<Student> students = Stream
                .generate(()->Student.getRandomStudent(jsm,pym,jgame))
                .filter(s->s.getYearEnrolled() >= (currentYear- 4))
                .limit(10000)
                .toList();

        System.out.println(students
                .stream()
                .mapToInt(Student::getYearEnrolled)
                .summaryStatistics());

        students.subList(0,10).forEach(System.out::println);

        System.out.println(students
                .stream()
                .mapToInt(s->s.getEngagementMap().size())
                .summaryStatistics());

        var mappedActivity = students.stream()
                .flatMap(s ->s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,Collectors.counting()));

        mappedActivity.forEach((k,v)-> System.out.println(k+" "+v));

        var classCount = students.stream()
                .collect(Collectors.groupingBy(s->s.getEngagementMap().size(),
                Collectors.counting()));

        classCount.forEach((k,v)-> System.out.println(k+" "+v));

        var percentages = students.stream()
                .flatMap(s ->s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,Collectors.counting()));

        percentages.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
