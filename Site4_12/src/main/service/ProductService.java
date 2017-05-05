package main.service;
import java.util.List;
import main.models.pojo.Product;

/**
 * Created by admin on 22.04.2017.
 */
public interface ProductService {

    Product getProduct (int id);

    List<Product> getAll();

    void update(Product  product);

    void delete(Product product);

    Integer insert(Product product);
}
