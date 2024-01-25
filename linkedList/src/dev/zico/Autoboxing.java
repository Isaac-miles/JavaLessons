package dev.zico;

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
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
    }
    private static double getDoubleLiteralPrimitive(){
        return 100.0;
    }
}
