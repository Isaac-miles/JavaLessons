package dev.zico;

import java.time.LocalDate;
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
        this.studentId = lastStudentId++;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.gender = gender;
        this.ageEnrolled = ageEnrolled;
        this.programmingExperience = programmingExperience;

        for (Course course: courses){
            addCourse(course, LocalDate.of(yearEnrolled,1,1));
        }
    }

    public void addCourse(Course newCourse){
        addCourse(newCourse, LocalDate.now());
    }
    public void addCourse(Course newcourse, LocalDate enrollDate){
        engagementMap.put(newcourse.courseCode(), new CourseEngagement(newcourse,enrollDate,"Enrollment"));
    }

    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public boolean hasProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, CourseEngagement> getEngagementMap() {
        return Map.copyOf(engagementMap);
    }

    public int getYearsSinceEnrolled(){
        return LocalDate.now().getYear() - yearEnrolled;
    }

    public int getAge(){
        return ageEnrolled + getYearsSinceEnrolled();
    }

    public int getMonthsSinceActive(String courseCode){
        CourseEngagement info = engagementMap.get(courseCode);
        return  info == null ? 0 : info.getMonthsSinceActive();
    }

    public int getMonthsSinceActive(){
        int inactiveMonths = (LocalDate.now().getYear() - 2025) * 12;
        for(String key : engagementMap.keySet()){
            inactiveMonths = Math.min(inactiveMonths, getMonthsSinceActive(key));
        }
        return  inactiveMonths;
    }
    public double getPercentComplete(String courseCode){
        var info= engagementMap.get(courseCode);
        return  (info ==null) ? 0: info.getPercentComplete();
    }

    public void watchLecture(String courseCode, int lectureNumber, int month, int year){
        var activity = engagementMap.get(courseCode);
        if(activity !=null){
            activity.watchLecture(lectureNumber, LocalDate.of(year,month,1));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", countryCode='" + countryCode + '\'' +
                ", yearEnrolled=" + yearEnrolled +
                ", gender='" + gender + '\'' +
                ", ageEnrolled=" + ageEnrolled +
                ", programmingExperience=" + programmingExperience +
                ", engagementMap=" + engagementMap +
                '}';
    }
}
