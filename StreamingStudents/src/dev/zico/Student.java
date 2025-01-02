package dev.zico;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    private static long lastStudentId = 1;
    private final static Random random = new Random();

    private  final long studentId;
    private final String countryCode;
    private final int yearEnrolled;
    private  final String gender;
    private final int ageEnrolled;
    private final boolean programmingExperience;
    private final Map<String, CourseEngagement> engagementMap = new HashMap<>();

    public Student(String countryCode, int yearEnrolled, String gender,
                   int ageEnrolled, boolean programmingExperience,Course ...courses) {
        this.studentId = lastStudentId+1;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.gender = gender;
        this.ageEnrolled = ageEnrolled;
        this.programmingExperience = programmingExperience;
    }
}
