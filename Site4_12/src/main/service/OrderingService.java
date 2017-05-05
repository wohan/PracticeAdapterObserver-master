package main.service;
import main.models.pojo.Ordering;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */
@Service
public interface OrderingService {

    Ordering getOrdering (int id);

    List<Ordering> getAll();

    void update(Ordering ordering);

    void delete(Ordering ordering);

    Integer insert(Ordering ordering);
}
