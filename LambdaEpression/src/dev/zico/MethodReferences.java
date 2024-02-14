package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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
        calculator("Hello ","world", String::concat);

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
