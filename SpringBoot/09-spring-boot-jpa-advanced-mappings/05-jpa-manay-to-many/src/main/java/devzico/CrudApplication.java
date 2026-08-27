package devzico;

import devzico.dao.AppDAO;
import devzico.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO)
    {
        return runer->{
//            createCourseAndStudents(appDAO);
//            findCourseAndStudents(appDAO);
//            findStudentAndCourses(appDAO);
//            addMoreCoursesForStudents(appDAO);
//            deleteCourseById(appDAO);
            deleteStudent(appDAO);
        };
    }

    private void deleteStudent(AppDAO appDAO) {
        int id = 4;
        appDAO.deleteStudent(id);
        System.out.println("Deleted student with id " + id);
    }

    private void addMoreCoursesForStudents(AppDAO appDAO) {
        int id = 4;
        Student tempStudent = appDAO.findStudentAndCoursesById(id);
        Course tc1 = new Course("C# development");
        Course tc = new Course("Java development");
        tempStudent.addCourse(tc1);
        tempStudent.addCourse(tc);
        appDAO.updateStudent(tempStudent);

        System.out.println("Course added successfully "+ tempStudent);
        System.out.println("Course added successfully "+ tempStudent.getCourses());
    }

    private void findStudentAndCourses(AppDAO appDAO) {
        int id = 3;
        var student = appDAO.findStudentAndCoursesById(id);
        System.out.println("Student ID: " + student);
        System.out.println("Student Courses: " + student.getCourses());
    }

    private void findCourseAndStudents(AppDAO appDAO) {
        int id = 11;
        var tc = appDAO.findCourseAndStudentsByCourseId(id);
        System.out.println("findCourseAndStudentsByCourseId: " + tc);
        System.out.println("associating students "+ tc.getStudents());
    }

    private void createCourseAndStudents(AppDAO appDAO) {
        Course tempCourse = new Course("Hibernate Java Persistence");
        Student tempStudent = new Student("Joe","Isaac","joe@email.com");
        Student tempStudent1 = new Student("Mile","Two","two@email.com");

        tempCourse.addStudent(tempStudent);
        tempCourse.addStudent(tempStudent1);

        System.out.println("Saving courses ... "+tempCourse);
        System.out.println("Assigning students ... "+tempCourse.getStudents());
        appDAO.saveCourse(tempCourse);

    }

    private void deleteCourseAndReviews(AppDAO appDAO) {
        int id = 10;
        appDAO.deleteCourse(id);
        System.out.println("Deleted course with id " + id);
    }

    private void retrieveCourseAndReviews(AppDAO appDAO) {
        int id = 10;
        Course course = appDAO.findCourseAndReviews(id);
        System.out.println("Retrieved Course: " + course);
        System.out.println("Retrieved Course and Reviews: " + course.getReviews());
    }

    private void createCourseAndReviews(AppDAO appDAO) {
        var tempCourse = new Course("Emergency");
        tempCourse.addReview(new Review("health tips"));
        tempCourse.addReview(new Review("First Aid"));
        tempCourse.addReview(new Review("Why always slow"));

//        save the course... and leverage the cascade all
        appDAO.saveCourse(tempCourse);
        System.out.println("Course created successfully "+ tempCourse.getReviews());
    }

    private void deleteCourseById(AppDAO appDAO) {
        int id = 12;
        appDAO.deleteCourse(id);
        System.out.println("Course with id " + id + " deleted");
    }

    private void deleteInstructor(AppDAO appDAO) {
        int id = 1;
        appDAO.delete(id);
        System.out.println("Instructor deleted");
    }

    private void updateCourse(AppDAO appDAO) {
        int id = 10;
        var tempCourse = appDAO.findCourseById(id);
        System.out.println("tempCourse: " + tempCourse);
        tempCourse.setTitle("Breaking New Grounds");
        appDAO.updateCourse(tempCourse);
    }

    private void updateInstructor(AppDAO appDAO) {
        int id = 1;
        Instructor tempInstructor = appDAO.findById(id);
        System.out.println("updating instructor " + tempInstructor);
        tempInstructor.setLastName("Josiah");
        appDAO.update(tempInstructor);
    }

    private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor with courses join fetch ");
        Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(id);
        System.out.println("temp Instructor" +tempInstructor);
        System.out.println("Associated courses " + tempInstructor.getCourses());
    }

    private void findCoursesForInstructor(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor with courses by id " + id);
        Instructor instructor = appDAO.findById(id);
        System.out.println("Found instructor with courses by id " + instructor);
        List<Course> courses = appDAO.findCoursesByInstructorId(instructor.getId());
        instructor.setCourses(courses);
        System.out.println("Found instructor with courses by id " + instructor.getCourses());
    }

    private void findInstructorWithCourses(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor with courses by id " + id);
        Instructor instructor = appDAO.findById(id);
        System.out.println("Found instructor with courses by id " + instructor);
        System.out.println("Associated courses: " + instructor.getCourses());

    }

    private void createInstructorWithCourses(AppDAO appDAO) {
        Instructor tempInstructor = new Instructor("Nonso","Kone","nonso@hayoo.com");
        InstructorDetail tempInstructorDetail = new InstructorDetail("www.nonso/foodie","Talking");
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        Course pyth = new Course("Python Tutorials");
        Course java = new Course("Java Tutorials");
        tempInstructor.addCourse(pyth);
        tempInstructor.addCourse(java);

        //save the instructor
        //Note this will also save the course
        //Because of the CascadeType.PERSIST
        System.out.println("Instructor added "+tempInstructor);
        System.out.println("-".repeat(30));
        System.out.println("The Courses: "+tempInstructor.getCourses());
        appDAO.save(tempInstructor);
        System.out.println("Done");
    }

    private void deleteInstructorDetail(AppDAO appDAO) {
        int id = 3;
        System.out.println("Deleting instructor detail with id " + id);
        appDAO.deleteInstructorDetailById(id);
        System.out.println("Deleted instructor detail with id " + id);
    }

    private void findInstructorDetail(AppDAO appDAO) {
        int id = 2;
        System.out.println("Finding instructor detail by id " + id);
        var instructorDetail = appDAO.findInstructorDetailById(id);
        System.out.println("Instructor Detail found "+ instructorDetail );
        System.out.println("associate details "+ instructorDetail.getInstructor());
    }

    private void removeInstructor(AppDAO appDAO) {
        int id = 1;
        System.out.println("Removing instructor " + id);
        appDAO.delete(id);
        System.out.println("Instructor Deleted " + id);
    }

    private void findInstructor(AppDAO appDAO) {
        int id = 3;
        System.out.println("Finding instructor with id " + id);
        var instructor = appDAO.findById(id);
        if (instructor == null) {
            System.out.println("No instructor with id " + id);
        }else{
            System.out.println("tempInstructor "+ instructor);
            System.out.println("associate details "+ instructor.getInstructorDetail());
        }

    }

    private void createInstructor(AppDAO appDAO) {
        Instructor tempInstructor = new Instructor("Miles","Omokafe","miles@hayoo.com");
//        Instructor tempInstructor = new Instructor("Zico","avies","zico@hayoo.com");

        InstructorDetail tempInstructorDetail = new InstructorDetail("www.miles/home","Dancing");
        tempInstructor.setInstructorDetail(tempInstructorDetail);
        System.out.println("Instructor created "+ tempInstructor);
        appDAO.save(tempInstructor);
    }
}
