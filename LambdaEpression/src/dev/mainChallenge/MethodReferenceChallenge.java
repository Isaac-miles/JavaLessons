package dev.mainChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodReferenceChallenge {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Anna","Bob","Cameron","Donald","Eva","Francis"};
        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s->s+" "+ getRandomChar('A','Z')+"."


        ));
        applyChanges(names,list);
    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFuntions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function:stringFuntions){
            backedByArray.replaceAll((s)->s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt(startChar,endChar+1);
    }

    private static String reverse(String s){
        return reverse(s, 0, s.length());
    }
    private static String reverse(String s,int start,int end){
        return new StringBuilder(s.substring(start,end)).reverse().toString();
    }
}
