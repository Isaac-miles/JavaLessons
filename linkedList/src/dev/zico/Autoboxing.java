package dev.zico;

public class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //preferred but necessary
//        Integer depreciatedBoxing = new Integer(13);
        int unboxedInt = boxedInt.intValue(); //unnecessary

        //Automatic
        Integer autoBox = 15;
        int autoUnboxed = autoBox;
        System.out.println(autoBox.getClass().getName());

        Double resultBoxed = getDoubleObject(); //java compiler automatically boxing it because its being assign to a java.lan.Double class
        double resultUnboxed = getDoubleLiteralPrimitive(); //same as this auto unboxing
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
    }
    private static Double getDoubleLiteralPrimitive(){
//        return 100.0;
    }
}
