package dev.zico;

import consumer.specific.ChildClass;
import dev.generic.BaseClass;
import external.util.Logger;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(20));
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(20));
        child.recommendedMethod();

        System.out.println("-".repeat(20));
        parent.recommendedStatic();
        System.out.println("-".repeat(20));
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(20));
        child.recommendedStatic();

        System.out.println("-".repeat(20));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument,19,zArgument);
        System.out.println("After Method, xArgument: "+ xArgument);
        System.out.println("After Method, xArgument: "+ zArgument);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker);
    }
    private static void doXYZ(String x, int y, final StringBuilder z){
        final String c = x + y;
        System.out.println("c = "+c);
        x = c;
        z.append(y);
//        z = new StringBuilder()"This is a new reference"
    }
}