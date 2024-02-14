package dev.miniChallenge;

import java.util.function.Supplier;

public class SupplierLambdaExpression {
    public static void main(String[] args) {
        Supplier<String> iLoveJava = ()-> "I Love Java";
        System.out.println(iLoveJava.get());
    }
}
