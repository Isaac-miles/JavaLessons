package dev.zico.restdemo.rest;

import dev.zico.restdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    //define @postConstruct to load the student data ... only once
    @PostConstruct
    public void loadStudents() {
        students = new ArrayList<>();
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Joe"));
        students.add(new Student("Janet", "Toe"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId) {
        if((studentId >= students.size())|| studentId < 0){
            throw new StudentNotFoundException("Student Id not found - " + studentId);
        }
        return students.get((studentId));
    }


  //Add an exception handler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
       StudentErrorResponse error = new StudentErrorResponse();
       error.setStaus(HttpStatus.NOT_FOUND.value());
       error.setMessage(e.getMessage());
       error.setTimestamp(System.currentTimeMillis());

       return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //catch any exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception e) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStaus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(e.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
