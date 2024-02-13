package dev.challenge;

import java.util.function.Supplier;

public class SupplierLambdaExpression {
    public static void main(String[] args) {
        Supplier<String> message = ()->{
            return "I Love Java";
        };
       String iLovejava  = message.get();
        System.out.println(iLovejava);
    }
}
