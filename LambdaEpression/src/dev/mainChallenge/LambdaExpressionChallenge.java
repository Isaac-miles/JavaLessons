package dev.mainChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaExpressionChallenge {
    private  static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna","Bob","Carol","David","Ed","Fred","Gary"};
        Arrays.setAll(names, i->names[i].toUpperCase());
        System.out.println("---->Transformed to uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s->s+" "+getRandomChar('A','B')+".");
        System.out.println("---->Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s->s+" "+getReversedName(s.split(" ")[0]));
        Arrays.asList(names).forEach(s-> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
     //   newList.removeIf(s->s.substring(0,s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));

        //using multi line lambda expression
        newList.removeIf(s-> {
           String first = s.substring(0, s.indexOf(" ")) ;
            String last = (s.substring(s.lastIndexOf(" ") + 1));
            return first.equals(last);
        });

        System.out.println("------>Remove names where first equals last");
        newList.forEach(s-> System.out.println(s));

    }
    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt(startChar, endChar+1);
    }
    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
