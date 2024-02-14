package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld{
    private static int last_id = 1;
    private int id;
    public PlainOld() {
        id= PlainOld.last_id++;
        System.out.println("Creating plainOld Object: id = "+ id);
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Ann","Bob","Dave"));
        list.forEach(System.out::println);

        calculator(5,3, Integer::sum);
        calculator(2.4,7.5, Double::sum);

        Supplier<PlainOld> reference1 = PlainOld::new;
        reference1.get();
        System.out.println("Getting Array");
        PlainOld[] pojo1 = seedArray(PlainOld::new,5);

        calculator("Hello ","world",(s1,s2)->s1.concat(s2));
        //the method reference requires a lambda expression with two arguments
        calculator("Hello ","world", String::concat);

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String,String,String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Miles","Right"));
        System.out.println(b2.apply("Miles","Right"));
        System.out.println(u1.apply("Miles"));

        //the string transform method which takes a string and a method with string as arguments
        String result ="Hello".transform(u1);
        System.out.println("result "+ result);

        result = result.transform(String::toLowerCase);
        System.out.println(result);

        Function<String,Boolean>  fo = String::isEmpty;
        boolean resultBoolean = result.transform(String::isEmpty);
        System.out.println("Result = "+ resultBoolean);


    }

    private static <T> void calculator(T v1, T v2, BinaryOperator<T> function){
        T result = function.apply(v1,v2);
        System.out.println("Result of operation: "+result);
    }
    private static PlainOld[] seedArray(Supplier<PlainOld> reference,int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array,i->reference.get());
        return array;
    }
}
