package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        String name ="Tim";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Hellen");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String,String[]> f0 = uCase
                .andThen(s->s.concat(" Mike"))
                .andThen(s->s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String,String> f1 = uCase
                .andThen(s->s.concat(" Mike"))
                .andThen(s->s.split(" "))
                .andThen(s->s[1].toUpperCase()+", "+s[0]);
        System.out.println(f1.apply(name));

        Function<String,Integer> f2= uCase
                .andThen(s->s.concat(" Mike"))
                .andThen(s->s.split(" "))
                .andThen(s->s[1].toUpperCase()+", "+s[0])
                .andThen(s->String.join(", ",s))
                .andThen(String::length);
          System.out.println(f2.apply(name));

          //using consumer
        String[] names = {"Ann","Bob","Carol"};
        Consumer<String> s0 = s-> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0.andThen(s-> System.out.print(" _ ")).andThen(s1));

        Predicate<String> p1 = s->s.equals("Miles");
        Predicate<String> p2 = s->s.equalsIgnoreCase("bob");
        Predicate<String> p3 = s->s.startsWith("I");
        Predicate<String> p4 = s->s.endsWith("o");

        Predicate<String> combine1 = p1.or(p2);
        System.out.println("combined1 = "+ combine1.test(name));
        Predicate<String> combine2 = p3.and(p4);
        System.out.println("combine2 = "+ combine2.test(name));

        Predicate<String> combine3 = p3.and(p4).negate();
        System.out.println("comnine3 = "+combine3.test(name));

        record Person(String firstName,String lastname){}
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Mikky","Water"),
                new Person("Stan","Nice"),
                new Person("Minnie","mouse")
        ));

        list.sort((o1,o2)->o1.lastname.compareTo(o2.lastname));
        list.forEach(System.out::println);

        System.out.println("-----------------------------------");
        list.sort(Comparator.comparing(o -> o.lastname));

        list.sort(Comparator.comparing(Person::lastname));
        list.forEach(System.out::println);

        System.out.println("-----------------------------------");
        list.sort(Comparator.comparing(Person::lastname).thenComparing(Person::firstName));
        list.forEach(System.out::println);

        System.out.println("-----------------------------------");
        list.sort(Comparator.comparing(Person::lastname).thenComparing(Person::firstName).reversed());
        list.forEach(System.out::println);
    }
}
