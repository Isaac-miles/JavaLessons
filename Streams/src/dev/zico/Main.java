package dev.zico;

import java.util.*;
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

        Map<Character,int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for(char c :"BINGO".toCharArray()){
            int[] numbers = new int[5];
            int labelNo = bingoIndex;
            Arrays.setAll(numbers,i->+labelNo);
            myMap.put(c,numbers);
            bingoIndex += 15;
        }

        myMap.entrySet()
                .stream()
                .map(e->e.getKey()+" has range: "+ e.getValue()[0]+ " _ "+e.getValue()[e.getValue().length-1])
                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(()->random.nextInt(2))
                .limit(10)
                .forEach(System.out::print);
    }

}
