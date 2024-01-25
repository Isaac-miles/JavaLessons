package dev.zico;

import java.util.ArrayList;
import java.util.Arrays;

public class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //preferred but necessary
//        Integer depreciatedBoxing = new Integer(13);
        int unboxedInt = boxedInt.intValue(); //unnecessary

        //Automatic
        Integer autoBox = 15;
        int autoUnboxed = autoBox;
        System.out.println(autoBox.getClass().getName());

        Double resultBoxed = getDoubleLiteralPrimitive(); //java compiler automatically boxing it because its being assign to a java.lan.Double class
        double resultUnboxed = getDoubleObject(); //same as this auto unboxing

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 10;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }
    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i:varargs){
            aList.add(i);
        }
        return aList;
    }
    private static int returnAnInt(Integer i){
        return i;
    }
    private static Integer returnAnInteger(int i){
        return i;
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
    }
    private static double getDoubleLiteralPrimitive(){
        return 100.0;
    }
}
