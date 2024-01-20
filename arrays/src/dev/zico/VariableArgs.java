package dev.zico;

public class VariableArgs {
    public static void main(String... args) {
        System.out.println("Hello world");
        String[] splitStrings = "Hello miles".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("hello");
        printText();
        System.out.println("_".repeat(20));

        String[] strings = {"miles","choko","world"};
        System.out.println(String.join("-",strings));
    }

    public static void printText(String... texts){
        for(String text : texts){
            System.out.println(text);
        }
    }

}
