package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Mick","Z ico","John","Bravo","Alpha"
        ));

        String prefix = "Ninja";
        list.forEach(s-> {
            char first = s.charAt(0);
            System.out.println(prefix + " "+  first+" means "+ s);
        });

        int result = calculator((a,b)->a+b, 5,4);
        int result1 = calculator((Integer a, Integer b)->a+b, 5,4);
        var result2 = calculator((a, b)-> a / b, 5.5,4.5);


    }
    public static  <T> T calculator(Operations<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}
