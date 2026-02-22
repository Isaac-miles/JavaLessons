package dev.zico.cruddemo.dao;

import dev.zico.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    void update(Student student);
    void delete(Student student);
}
