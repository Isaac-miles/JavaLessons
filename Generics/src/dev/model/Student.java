package dev.model;

import java.util.Random;

public class Student {
    Random random = new Random();
    private String name;
    private String course;
    private int yearStarted;
    private static String[] firstNames = {"Ann","Bill","Amos","John","Miles"};
    private static String[] courses = {"C", "C++","Java"};
    public Student (){
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)]+" "+(char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2019,2024);
    }
}
