package devzico.dao;

import devzico.entity.Instructor;
import devzico.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor instructor);
    Instructor findById(int id);
    void update(Instructor instructor);
    void delete(int id);
    InstructorDetail findInstructorDetailById(int id);
    void deleteInstructorDetailById(int id);
}
