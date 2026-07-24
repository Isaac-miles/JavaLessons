package devzico.dao;

import devzico.entity.Course;
import devzico.entity.Instructor;
import devzico.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor instructor);
    Instructor findById(int id);
    void update(Instructor instructor);
    void delete(int id);
    InstructorDetail findInstructorDetailById(int id);
    void deleteInstructorDetailById(int id);
    List<Course> findCoursesByInstructorId(int id);
    Instructor findInstructorByIdJoinFetch(int id);
    void updateCourse(Course course);
    Course findCourseById(int id);
    void deleteCourse(int id);
}
