package dev.challenge2;

import dev.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    Random random = new Random();

    private static int LAST_ID= 1_000;
    private int studentId;
    private String name;
    private String course;
    private int yearStarted;
    private static String[] firstNames = {"Ann","Bill","Amos","John","Miles"};
    private static String[] courses = {"C", "C++","Java"};
    public Student(){
        studentId = LAST_ID++;
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)]+" "+(char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2019,2024);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId,name,course,yearStarted);
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

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.studentId);
    }


}
