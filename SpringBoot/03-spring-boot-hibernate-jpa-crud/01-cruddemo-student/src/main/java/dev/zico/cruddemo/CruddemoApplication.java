package dev.zico.cruddemo;

import dev.zico.cruddemo.dao.StudentDAO;
import dev.zico.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
            createMultipleStudents(studentDAO);
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        //create multiple students
        System.out.println("Creating student ");
        Student student = new Student("Cruize","Doe","cruize@dev.zico");
        Student student2 = new Student("Miles","Doe","miles@dev.zico");
        Student student3 = new Student("Davies","Doe","Davies@dev.zico");

        //save the student objects
        studentDAO.save(student);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void createStudent(StudentDAO studentDAO) {
        //create the student object
        System.out.println("Creating student ");
        Student student = new Student("paul","Doe","paul@dev.zio");

        //save the student object
        System.out.println("Saved student " + student);
        studentDAO.save(student);

        //display id of the saved student
        System.out.println("Saved student. Generated ID " + student.getId());
    }
}
