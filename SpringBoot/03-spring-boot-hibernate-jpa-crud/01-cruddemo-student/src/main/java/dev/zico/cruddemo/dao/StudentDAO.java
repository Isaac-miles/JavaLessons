package dev.zico.cruddemo.dao;

import dev.zico.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    void update(Student student);
    void delete(Student student);
}
