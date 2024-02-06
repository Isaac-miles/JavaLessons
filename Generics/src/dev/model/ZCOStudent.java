package dev.model;

import java.util.Random;
public class ZCOStudent extends Student{
    Random random = new Random();
    private double percentComplete;
    public ZCOStudent(){
        percentComplete = random.nextDouble(0,100.001);
    }
}
