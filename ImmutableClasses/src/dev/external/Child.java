package dev.external;

import dev.constructorsProject.Parent;

import java.util.Random;

public class Child  extends Parent {
    private final int birthOrder = getBirthOrder();
    private final String birthOrderString;

    {
        if(siblings ==0){
            birthOrderString = "Only";
        }else if(birthOrder == 1){
            birthOrderString = "First";
        }else if(birthOrder == siblings +1){
            birthOrderString = "Last";
        }else {
            birthOrderString ="Middle";
        }
        System.out.println("Child: Initializer, birthOrder = "+birthOrder+", birthOderString = "+birthOrderString);
    }
    public Child() {
        super("Mike Doe", "01/01/1902",5);
        System.out.println("This is the Child's constructor");
    }
    private final int getBirthOrder(){
        if(siblings ==0) return 1;
        return new Random().nextInt(1,siblings+2);
    }

    @Override
    public String toString() {
        return  super.toString()+", "+birthOrderString+" child";
    }
}
