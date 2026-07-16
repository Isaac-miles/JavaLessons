package devzico.dao;

import devzico.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
}
