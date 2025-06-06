package dev.zico;

import java.time.LocalDate;
import java.util.*;

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

    public Student(String countryCode, int yearEnrolled,
                   int ageEnrolled, String gender,boolean programmingExperience,Course ...courses) {
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

    private static String getRandomVal(String ...data){
        return data[random.nextInt(data.length)];
    }

    private static  Course[] getRandomSelection(Course ...courses){
        int courseCount = random.nextInt(1,courses.length+1);
        List<Course> courseList = new ArrayList<>(Arrays.asList(courses));
        Collections.shuffle(courseList);
        List<Course> selectedCourses = courseList.subList(0, courseCount);
        return  selectedCourses.toArray(new  Course[0]);
    }

    public  static Student getRandomStudent(Course ...courses){
        int maxYear = LocalDate.now().getYear() + 1;
        Course[] randomCourses = getRandomSelection(courses);
        Student student = new Student(getRandomVal("AG","ESN","NG","CA","UAE","MOR","UK","US"),
                random.nextInt(2015,maxYear),
                random.nextInt(18,90),
                getRandomVal("M","F","O"),
                random.nextBoolean(),
                randomCourses);

        for(Course c:randomCourses){
            int lecture = random.nextInt(30,c.lectureCount());
            int year = random.nextInt(student.getYearEnrolled(),maxYear);
            int month = random.nextInt(1,13);
            if(year ==(maxYear-1)){
                if(month > LocalDate.now().getMonthValue()){
                    month = LocalDate.now().getMonthValue();
                };
            }
            student.watchLecture(c.courseCode(),lecture,month,year);
        }
        return  student;
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
