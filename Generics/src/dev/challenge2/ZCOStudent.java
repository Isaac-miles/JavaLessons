package dev.challenge2;

import java.util.Random;

public class ZCOStudent extends Student{
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

    @Override
    public boolean matchFieldValues(String fieldName, String value) {
        if(fieldName.equalsIgnoreCase("percentComplete")){
            return percentComplete <= Integer.parseInt(value);
        }
        return super.matchFieldValues(fieldName, value);
    }

}
