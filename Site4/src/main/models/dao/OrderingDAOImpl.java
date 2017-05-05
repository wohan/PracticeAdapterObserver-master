package main.models.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static main.models.ConnectionBase.insertBase;
import static main.models.ConnectionBase.insertBaseOne;
import static main.models.ConnectionBase.selectBase;
import main.models.pojo.Ordering;

public class OrderingDAOImpl implements OrderingDAO {

    private static final String GET_ALL = "SELECT * FROM public.ordering";
    private static final String GET_BY_ID = "SELECT * FROM public.ordering WHERE id=";
    private static final String INSERT = "INSERT INTO buyer(\n" + " id, id_buyer, data, description)\n" + " VALUES (?,?, ?, ?)";
    private static final String UPDATE = "UPDATE ordering SET id_buyer = ?, data = ?, description = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM ordering WHERE id=?";

    /**
     *  Метод добавления записи Ordering(заказ) в БД , на вход подаем обьект Ordering.
     *  Возвращает ID заведенной строки.
      * @param ordering на вход подаем обьект класса Ordering.
     * @return Integer id, возвращаем id вставленной строки.
     */
    public Integer insert(Ordering ordering){
        Integer idOrdering = -1;
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            preparedStatement = insertBaseOne(INSERT);
            preparedStatement.setInt(1, ordering.getId());
            preparedStatement.setInt(2, ordering.getId_buyer());
            preparedStatement.setInt(3, ordering.getData());
            preparedStatement.setString(4, ordering.getDescription());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                idOrdering = resultSet.getInt(1);
            }
            return idOrdering;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idOrdering;
    }

    /**
     * Метод извлечения всех записей Ordering(заказ) из БД.
     * @return Возвращает список обьектов Ordering.
     */
    public ArrayList<Ordering> getAll() {
        try {
            ResultSet result;
            result = selectBase(GET_ALL);
            ArrayList<Ordering> orderings = new ArrayList<Ordering>();
            while (result.next()) {
                Ordering ordering = new Ordering(result.getInt(1), result.getInt(2),
                        result.getInt(3), result.getString(4));
                orderings.add(ordering);
            }
            return orderings;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Ordering>();
    }

    /**
     * Метод извлечения  записи Ordering (заказ) из БД.
     * @param id заказа, которого извлекаем.
     * @return Возвращает обьек Ordering.
     */
    public Ordering getById(Integer id) {
        try {
            ResultSet result;
            result = selectBase(GET_BY_ID  + id);
            result.next();
            Ordering ordering = new Ordering(result.getInt(1), result.getInt(2),
                    result.getInt(3), result.getString(4));
            return ordering;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Ordering();
    }

    /**
     * Метод записи обьекта Ordering(заказ) в БД.
     * @param ordering - обьект класса Ordering.
     */
    public void update(Ordering ordering) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(UPDATE);
            preparedStatement.setInt(1, ordering.getId());
            preparedStatement.setInt(2, ordering.getId_buyer());
            preparedStatement.setInt(3, ordering.getData());
            preparedStatement.setString(4, ordering.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удаления обьекта Ordering(заказ) из БД.
     * @param ordering
     */
    public void delete(Ordering ordering) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(DELETE_BY_ID);
            preparedStatement.setInt(1, ordering.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
