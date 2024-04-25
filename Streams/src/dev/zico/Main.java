package dev.zico;

import java.util.*;
import java.util.stream.IntStream;
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

        System.out.println();
        IntStream.iterate(1,n->n+1)
                .filter(Main::isPrime)
                .limit(20)
                .forEach(s->System.out.print(s+" "));

        System.out.println();
        IntStream.iterate(1,n->n+1)
                .limit(100)
                .filter(Main::isPrime)
                .forEach(s->System.out.print(s+" "));

        System.out.println();
        IntStream.iterate(1,n-> n<=100, n->n+1)
                .filter(Main::isPrime)
                .forEach(s->System.out.print(s+" "));

        System.out.println();
        IntStream.rangeClosed(1,100)
                .filter(Main::isPrime)
                .forEach(s->System.out.print(s+" "));

    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        for(int divisor=2; divisor <= wholeNumber/2;divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }

        }
        return  true;
    }
}
