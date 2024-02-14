package dev.zico;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Ann","Bob","Dave"));
        list.forEach(System.out::println);
    }

    private static <T> void calculator(T v1, T v2, BinaryOperator<T> function){
        T result = function.apply(v1,v2);
        System.out.println("Result of operation: "+result);
    }
}
