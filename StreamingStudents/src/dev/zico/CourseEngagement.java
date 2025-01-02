package dev.zico;

import java.time.LocalDate;

public class CourseEngagement {
    private final Course course;
    private final LocalDate enrollmentDate;
    private  String engamentType;
    private LocalDate lastActivityDate;

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engamentType) {
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.engamentType = engamentType;
    }
}
