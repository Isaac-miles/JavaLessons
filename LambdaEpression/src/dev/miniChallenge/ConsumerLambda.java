package dev.miniChallenge;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        //change the anonymous class below to a lambda expression
        Consumer<String> printsWords = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for(String part:parts){
                    System.out.println(part);
                }
            }
        };
        //Lambda equivalent
        Consumer<String> lambdaPrintWords = s ->{
            String[] parts = s.split(" ");
            for(String part:parts){
            System.out.println(part);
         }
        };
        printsWords.accept("Hello my dear tommorow is valentine");
        lambdaPrintWords.accept("Dear Isaac you are trying your best, comtinue");

        Consumer<String> printWordForEach = sentence->{
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s-> System.out.println(s));
        };
        Consumer<String> printWordConcise = sentence->{
            Arrays.asList(sentence.split(" ")).forEach(s-> System.out.println(s));
        };
    }
}
