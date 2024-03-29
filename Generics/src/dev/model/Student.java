package dev.model;

import dev.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem {
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

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValues(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME"-> name.equalsIgnoreCase(value);
            case "COURSE"->course.equalsIgnoreCase(value);
            case "YEARSTARTED"->yearStarted==(Integer.parseInt(value));
            default -> false;
        };
    }
}
