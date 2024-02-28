package dev.zico;

import consumer.specific.ChildClass;
import dev.generic.BaseClass;

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
    }
}