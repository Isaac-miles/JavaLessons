package dev.zico;

public class VariableArgs {
    public static void main(String... args) {

    }

    public static void printText(String[] texts){
        for(String text : texts){
            System.out.println(text);
        }
    }

}
