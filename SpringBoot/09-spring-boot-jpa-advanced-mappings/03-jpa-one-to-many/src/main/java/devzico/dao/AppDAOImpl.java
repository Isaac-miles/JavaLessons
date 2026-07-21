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
        
    }

    @Override
    @Transactional
    public void delete(int id) {
        Instructor findById = em.find(Instructor.class, id);
        em.remove(findById);
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
}
