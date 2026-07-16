package devzico.dao;

import devzico.entity.Instructor;

public interface AppDAO {

    void save(Instructor instructor);
    Instructor findById(int id);
    void update(Instructor instructor);
    void delete(int id);
}
