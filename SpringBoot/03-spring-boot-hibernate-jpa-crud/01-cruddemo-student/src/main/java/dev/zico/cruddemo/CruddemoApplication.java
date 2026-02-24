package dev.zico.cruddemo;

import dev.zico.cruddemo.dao.StudentDAO;
import dev.zico.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
          //  createStudent(studentDAO);
          //  createMultipleStudents(studentDAO);
            // readStudent(studentDAO);
         // findAllStudents(studentDAO);
            findByLastName(studentDAO);
        };
    }

    private void findByLastName(StudentDAO studentDAO) {
        //get list of students
       List<Student> students = studentDAO.findByLastName("doe");

        //display the list of students
        for(Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        //create a student object
        System.out.println("Creating new student object...");
        Student student = new Student("Dan","Dizzy","dan@dez.zico");

        //save the student
        studentDAO.save(student);

        //display id of the saved student
        System.out.println("saved student with id " + student.getId());

        //retrieve student based on the id: primary key
        Student retrievedStudent = studentDAO.findById(student.getId());

        //display student
        System.out.println("Retrieved student with id " + retrievedStudent);
    }

    private void findAllStudents(StudentDAO studentDAO) {

        //display the list of students
        for(Student student : studentDAO.findAll()) {
            System.out.println("Retrieved student  " + student);
        }
    };

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
