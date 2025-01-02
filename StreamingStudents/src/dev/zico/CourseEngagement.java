package dev.zico;

import java.time.LocalDate;
import java.time.Period;

public class CourseEngagement {
    private final Course course;
    private final LocalDate enrollmentDate;
    private  String engamentType;
    private LocalDate lastActivityDate;
    int lastLecture;
    public CourseEngagement(Course course, LocalDate enrollmentDate, String engamentType) {
        this.course = course;
        this.enrollmentDate = this.lastActivityDate = enrollmentDate;
        this.engamentType = engamentType;
    }

    public String getCourseCode() {
        return course.courseCode();
    }

    public int getEnrollmentYear() {
        return enrollmentDate.getYear();
    }

    public String getEngamentType() {
        return engamentType;
    }

    public int getLastActivityYear() {
        return lastActivityDate.getYear();
    }

    public  String getLastActivityMonth(){
        return  "%tb".formatted(lastActivityDate);
    }

    public double getPercentComplete(){
        return lastLecture * 100.0/ course.lectureCount();
    }

    public int getMonthsSinceActive(){
        LocalDate now = LocalDate.now();
        var months = Period.between(lastActivityDate, now).toTotalMonths();
        return (int) months;
    }

    void watchLecture(int lectureNumber, LocalDate currentDate){
        lastLecture = Math.max(lectureNumber, lastLecture);
        lastActivityDate = currentDate;
        engamentType = "Lecture "+ lastLecture;
    }

    @Override
    public String toString() {
        return "%s: %s %d %s [%d]".formatted(course.courseCode(),getLastActivityMonth(),getLastActivityYear(),
                engamentType, getMonthsSinceActive());
    }
}
