package main.service;

/**
 * Created by admin on 23.04.2017.
 */
import main.models.dao.*;
import main.models.pojo.Product;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by admin on 22.04.2017.
 */
@Service
public class ProductServiceImpl implements  ProductService {

    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);

    public Product getProduct(int id) {
        ProductDAO productDAO = new ProductDAOImpl();
        Product product = productDAO.getById(id);
        return product;
    }

    public List<Product> getAll() {
        ProductDAO productDAO = new ProductDAOImpl();
        List<Product> products = new ArrayList<Product>();
        products = productDAO.getAll();
        return products;
    }

    public void update(Product product) {
        ProductDAO productDAO = new ProductDAOImpl();
        productDAO.update(product);
    }

    public void delete(Product product) {
        ProductDAO productDAO = new ProductDAOImpl();
        productDAO.delete(product);
    }

    public Integer insert(Product product) {
        ProductDAO productDAO = new ProductDAOImpl();
        return productDAO.insert(product);
    }
}
