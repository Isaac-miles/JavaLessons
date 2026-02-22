package dev.zico.cruddemo.dao;

import dev.zico.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student student);
    void findById(Integer id);
    void update(Student student);
    void delete(Student student);
}
