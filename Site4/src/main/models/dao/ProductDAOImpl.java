package main.models.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static main.models.ConnectionBase.insertBase;
import static main.models.ConnectionBase.insertBaseOne;
import static main.models.ConnectionBase.selectBase;
import main.models.pojo.Product;

/**
 * Created by admin on 22.04.2017.
 */
public class ProductDAOImpl implements ProductDAO {

    private static final String GET_ALL = "SELECT * FROM public.product";
    private static final String GET_BY_ID = "SELECT * FROM public.product WHERE id=";
    private static final String INSERT = "INSERT INTO product(\n" + " id, id_ordering, " +
            "name, price, quantity)\n" + " VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE product SET id_ordering = ?, " +
            "name = ?, price = ?, quantity = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM product WHERE id=?";

    /**
     *  Метод добавления записи Product(продукт) в БД , на вход подаем обьект Product.
     *  Возвращает ID заведенной строки.
     * @param product
     * @return Integer id
     */
    public Integer insert(Product product){
        Integer idProduct = -1;
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            preparedStatement = insertBaseOne(INSERT);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getId_ordering());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(4, product.getQuantity());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                idProduct = resultSet.getInt(1);
            }
            return idProduct;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idProduct;
    }

    /**
     * Метод извлечения всех записей Product(продуктов) из БД.
     * @return Возвращает список обьектов Product.
     */
    public ArrayList<Product> getAll() {
        try {
            ResultSet result;
            result = selectBase(GET_ALL);
            ArrayList<Product> products = new ArrayList<Product>();
            while (result.next()) {
                Product product = new Product(result.getInt(1), result.getInt(2),
                        result.getString(3), result.getInt(4), result.getInt(5));
                products.add(product);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Product>();
    }

    /**
     * Метод извлечения  записи Product(продукт) из БД.
     * @param id продукта, которого извлекаем.
     * @return Возвращает обьек Product с заданным id.
     */
    public Product getById(Integer id) {
        try {
            ResultSet result;
            result = selectBase(GET_BY_ID  + id);
            result.next();
            Product product = new Product(result.getInt(1), result.getInt(2),
                    result.getString(3), result.getInt(4), result.getInt(5));
            return product;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Product();
    }

    /**
     * Метод записи обьекта Product(продукт) в БД.
     * @param product - обьект класса Product.
     */
    public void update(Product product) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(UPDATE);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getId_ordering());
            preparedStatement.setString(4, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удаления обьекта Product(продукт) из БД.
     * @param product
     */
    public void delete(Product product) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(DELETE_BY_ID);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
