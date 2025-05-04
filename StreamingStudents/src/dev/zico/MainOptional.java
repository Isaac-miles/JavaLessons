package dev.zico;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOptional {
    public static void main(String[] args) {
        Course jsm = new Course("JSM", "Javascript Masterclass");
        Course pym = new Course("PYM", "Python Masterclass");

        List<Student> students =
                Stream.generate(()->Student.getRandomStudent(jsm,pym))
                        .limit(1000)
                        .collect(Collectors.toList());

        Optional<Student> o1 = getStudent(null,"first");
        System.out.println("Empty = "+o1.isEmpty()+ ", Present = "+o1.isPresent());
        System.out.println();
    }

    private static Optional<Student> getStudent(List<Student> list, String type){
        if(list==null||list.size()==0){
            return Optional.empty();
        } else if (type.equals("first")) {
            return  Optional.of(list.get(0));
        } else if (type.equals("last")) {
            return Optional.of(list.get(list.size()-1));
        }
        return Optional.of(list.get(new Random().nextInt(list.size())));
    }
}
