package dev.zico;

import java.time.LocalDate;

public class CourseEngagement {
    private final Course course;
    private final LocalDate enrollmentDate;
    private  String engamentType;
    private LocalDate lastActivityDate;

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
}
