package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

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
        var result3 = calculator((a,b)->a.toUpperCase()+" "+ b.toUpperCase(),"Josiah"," Isaac");

        //using the consumer and the biConsumer
        var coords = Arrays.asList(
                new double[]{47.2160, -75.2946},
                new double[]{29.2160, -89.2946},
                new double[]{35.2160, -95.2946});
        coords.forEach(s-> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat,lon)-> System.out.printf("[lat:%.3f lon:%.3f]%n",lat,lon);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);
    }
    //using java util
    public static  <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }

    //created
    public static  <T> T calculator1(Operations<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}
