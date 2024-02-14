package dev.miniChallenge;

import java.util.function.Function;

public class StringBuilderLambda {
    public static void main(String[] args) {
        //or you can replace Function with UnaryOperator<String>
        Function<String, String> everyScondChar = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everyScondChar.apply("1234567890"));

        System.out.println(everySecondCharacter(everyScondChar,"1234567890"));

    }



    //change the following method to a lambda expression
    public static String everySecondCharQuestion(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<source.length(); i++){
            if(i % 2 == 1){
                returnVal.append(source.charAt(1));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String,String> character, String s) {
        return character.apply(s);
    }
}
