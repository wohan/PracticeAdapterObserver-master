package main.models.dao;
import main.models.pojo.Buyer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static main.models.ConnectionBase.insertBase;
import static main.models.ConnectionBase.insertBaseOne;
import static main.models.ConnectionBase.selectBase;

/**
 * Created by admin on 22.04.2017.
 */
public class BuyerDAOImpl implements BuyerDAO {

    private static final String GET_ALL = "SELECT * FROM public.buyer";
    private static final String GET_BY_ID = "SELECT * FROM public.buyer WHERE id=";
    private static final String INSERT = "INSERT INTO buyer(\n" + " id, user_name, user_pass, phone)\n" + " VALUES (?,?, ?, ?)";
    private static final String UPDATE = "UPDATE buyer SET user_name = ?, user_pass = ?, phone = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM buyer WHERE id=?";

    /**
     * Метод добавления записи Buyer(покупатель) в БД , на вход подаем обьект Buyer.
     * Возвращает ID заведенной строки.
     * @param buyer  на вход подаем обьект класса Buyer.
     * @return id, возвращаем id вставленной строки.
     */
    public Integer insert(Buyer buyer){
        Integer idBuyer = -1;
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            preparedStatement = insertBaseOne(INSERT);
            preparedStatement.setInt(1, buyer.getId());
            preparedStatement.setString(2, buyer.getUser_name());
            preparedStatement.setString(3, buyer.getUser_pass());
            preparedStatement.setInt(4, buyer.getPhone());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                idBuyer = resultSet.getInt(1);
            }
            return idBuyer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idBuyer;
    }

    /**
     * Метод извлечения всех записей Buyer(покупатель) из БД.
     * @return Возвращает список обьектов Buyer.
     */
    public ArrayList<Buyer> getAll() {
        try {
            ResultSet result;
            result = selectBase(GET_ALL);
            ArrayList<Buyer> buyers = new ArrayList<Buyer>();
            while (result.next()) {
                Buyer buyer = new Buyer(result.getInt(1), result.getString(2),
                        result.getString(3), result.getInt(4));
                buyers.add(buyer);
            }
            return buyers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Buyer>();
    }

    /**
     * Метод извлечения  записи Buyer(покупатель) из БД.
     * @param id Покупателя, которого извлекаем.
     * @return Возвращает обьек Buyer по id.
     */
    public Buyer getById(Integer id) {
        try {
            ResultSet result;
            //result = selectBase(GET_BY_ID + id);
            result = selectBase("SELECT * FROM public.buyer WHERE id=" + id);
            result.next();
            Buyer buyer = new Buyer(result.getInt(1), result.getString(2),
                    result.getString(3), result.getInt(4));
            return buyer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Buyer();
    }

    /**
     * Метод записи обьекта Buyer(покупатель) в БД.
     * @param buyer - обьект класса Buyer.
     */
    public void update(Buyer buyer) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(UPDATE);
            preparedStatement.setString(1, buyer.getUser_name());
            preparedStatement.setString(2, buyer.getUser_pass());
            preparedStatement.setInt(3, buyer.getPhone());
            preparedStatement.setInt(4, buyer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удаления обьекта Buyer(покупатель) из БД.
     * @param buyer
     */
    public void delete(Buyer buyer) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(DELETE_BY_ID);
            preparedStatement.setInt(1, buyer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
