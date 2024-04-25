package dev.zico;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"One","Two","Three"};
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

       var secondStream = Stream.of("Six","Five","Four")
                .map(String::toUpperCase)  ;
//                .forEach(System.out::println);

        Stream.concat(secondStream,firstStream)
                .map(s->s.charAt(0)+"_"+s)
                .forEach(System.out::println);

    }

}
