package main.models.dao;
import java.util.List;

/**
 *
 */
public interface DAO<PK, E> {

    List<E> getAll();

    E getById(PK id);

    PK insert(E entity);

    void update(E entity);

    void delete(E entity);
}