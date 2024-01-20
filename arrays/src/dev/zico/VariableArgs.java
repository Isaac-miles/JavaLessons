package dev.zico;

public class VariableArgs {
    public static void main(String... args) {
        System.out.println("Hello world");
        String[] splitStrings = "Hello miles".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("hello");
        printText();
    }

    public static void printText(String... texts){
        for(String text : texts){
            System.out.println(text);
        }
    }

}
