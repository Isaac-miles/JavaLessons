package dev.challenge2;

import dev.model.Student;

import java.util.Random;

public class ZCOStudent extends Student {
    Random random = new Random();
    private double percentComplete;
    public ZCOStudent(){
        percentComplete = random.nextDouble(0,100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
