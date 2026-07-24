package devzico.dao;

import devzico.entity.Course;
import devzico.entity.Instructor;
import devzico.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO {
    private EntityManager em;

    @Autowired
    public AppDAOImpl(EntityManager em) {
        this.em = em;
    }
    @Override
    @Transactional
    public void save(Instructor instructor) {
        em.persist(instructor);
    }

    @Override
    public Instructor findById(int id) {
        return em.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void update(Instructor instructor) {
        em.merge(instructor);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Instructor tempInstructor = em.find(Instructor.class, id);
        List<Course> courses = tempInstructor.getCourses();
        for (Course course : courses) {
            course.setInstructor(null);
        }
        em.remove(tempInstructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int id) {
        return em.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int id) {
        InstructorDetail tempInstructorDetail = em.find(InstructorDetail.class, id);
        //remove the associated object reference
        //break bidirectional link
        tempInstructorDetail.getInstructor().setInstructorDetail(null);
        em.remove(tempInstructorDetail);
    }

    @Override
    public List<Course> findCoursesByInstructorId(int id) {
        TypedQuery<Course> query = em.createQuery("from Course where instructor.id = :instructorId", Course.class);
        query.setParameter("instructorId", id);
        return query.getResultList();
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int id) {
        TypedQuery<Instructor> query = em.createQuery(
                "select i from Instructor i "
                + " JOIN FETCH i.courses "
                +" JOIN FETCH i.instructorDetail "
                + " where i.id = :instructorId ",
                Instructor.class);
        query.setParameter("instructorId", id);
        return (Instructor) query.getSingleResult();
    }

    @Override
    @Transactional
    public void updateCourse(Course course) {
        em.merge(course);
    }

    @Override
    public Course findCourseById(int id) {
        return em.find(Course.class, id);
    }

    @Override
    @Transactional
    public void deleteCourse(int id) {
        var course = em.find(Course.class, id);
        em.remove(course);
    }
}
