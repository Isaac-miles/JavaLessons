package dev.zico;

public class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //preferred but necessary
//        Integer depreciatedBoxing = new Integer(13);
        int unboxedInt = boxedInt.intValue(); //unnecessary

    }
}
