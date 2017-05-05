package main.service;
import main.models.pojo.Ordering;
import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */
public interface OrderingService {

    Ordering getOrdering (int id);

    List<Ordering> getAll();

    void update(Ordering ordering);

    void delete(Ordering ordering);

    Integer insert(Ordering ordering);
}
