package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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

        System.out.println("_".repeat(24));
        coords.forEach(s->processPoint(s[0],s[1],p1));

        list.removeIf(s->s.equalsIgnoreCase("bravo"));
        System.out.println(list);

        list.addAll(List.of("happy","earnest","committment"));
        list.forEach(s-> System.out.println(s));

        System.out.println("-".repeat(25));
        list.removeIf(s->s.startsWith("com"));
        list.forEach(s-> System.out.println(s));

        list.replaceAll(s -> s.charAt(0)+" - "+s.toUpperCase());
        System.out.println("_".repeat(25));
        list.forEach(s -> System.out.println(s));

        String[] emptyStrings = new String[10];
        Arrays.fill(emptyStrings,"-");
        System.out.println(Arrays.toString(emptyStrings));

        //the set all method unlike the replace all doesn't have access to the current element of an array but instead
        //the current index of that array
        Arrays.setAll(emptyStrings,(i)->""+(i+1)+". ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings,(i)->""+(i+1)+". "
        +switch (i){
            case 0->"one";
            case 1->"two";
            case 2->"three";
            default -> "";
        });
        System.out.println(Arrays.toString(emptyStrings));

        //The supplier lambder expression
        String[] names = {"Joey","Sammuel","Emmanuel","Daniel","Joy","David"};
        String[] randomList = randomlySelectedValues(10,names,()->new Random().nextInt(0,names.length));
        System.out.println(Arrays.toString(randomList));
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
    public static String[] randomlySelectedValues (int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
