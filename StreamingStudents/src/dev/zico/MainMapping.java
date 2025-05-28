package dev.zico;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class MainMapping {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass",100);
        Course pym = new Course("PYM", "Python Masterclass",50);

        List<Student> students = IntStream
                .rangeClosed(1,1000)
                .mapToObj(s->Student.getRandomStudent(jsm,pym))
                .toList();

//the collectors method returns a collector that collects data into a map, this map gets keyed by the result of the
// function lambda we provide

        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));
        mappedStudents.forEach((k,s)-> System.out.println(k +" "+ s.size()));

        System.out.println("-".repeat(30));
//  The static import statement lets you import one or more static members of a class, I can use the static import statement,
//  specifying the collectors class, with a wild card to import all static members.
//        import static java.util.stream.Collectors.*;

        int minAge = 25;
        var youngerSet = students.stream()
                .collect(groupingBy(Student::getCountryCode,
                 filtering(s->s.getAge() <=minAge, toList())));
        youngerSet.forEach((k,s)-> System.out.println(k +" "+ s.size()));

        var experienced = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience));
        System.out.println("Experience Student = "+ experienced.get(true).size());

        var expCount = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience,counting()));
        System.out.println("Experience Student = "+ expCount.get(true));

        var experienceAndActive = students.stream()
                .collect(partitioningBy(
                        s->s.hasProgrammingExperience() && s.getMonthsSinceActive() == 0
                        ,counting()));
        System.out.println("Experience and Active Student = "+ experienceAndActive.get(true));

        var multiLevel = students.stream()
                .collect(groupingBy(Student::getCountryCode, groupingBy(Student::getGender)));

        multiLevel.forEach((key, value)->{
            System.out.println(key);
            value.forEach((key1,value1)->
                    System.out.println("\t"+ key1+" "+value1.size()));
        });

//   the flatMap intermediate operation performs one-to-many transformations on elements in a stream pipeline.

        long studentBodyCount = 0;
        for (var list : experienced.values()){
            studentBodyCount += list.size();
        }
        System.out.println("studentBodyCount = "+studentBodyCount);

        studentBodyCount = experienced.values().stream()
                .mapToInt(l->l.size())
                .sum();
        System.out.println("studentBodyCount = "+ studentBodyCount);

        studentBodyCount = experienced.values().stream()
                .map(l->l.stream()
                        .filter(s->s.getMonthsSinceActive() <=3)
                .count())
                .mapToLong(l->l)
                .sum();
        System.out.println("studentBodyCount = "+ studentBodyCount);

//  let's use the flatMap instead

    }
}
