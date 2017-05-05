package main.models.dao;
import main.models.pojo.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static main.models.ConnectionBase.insertBase;
import static main.models.ConnectionBase.insertBaseOne;
import static main.models.ConnectionBase.selectBase;

/**
 *
 */

public class AdminDAOImpl implements AdminDAO {

    //private static final Logger logger = Logger.getLogger(AdminDAOImpl.class);


    private static final String GET_ALL = "SELECT * FROM public.admin";
    private static final String GET_BY_ID = "SELECT * FROM public.admin WHERE id=";
    private static final String INSERT = "INSERT INTO admin(\n" + " id, user_name, user_pass)\n" + " VALUES (?,?, ?)";
    private static final String UPDATE = "UPDATE admin SET user_name = ?, user_pass = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM admin WHERE id=?";

    /**
     * Метод добавления записи Admin(администратор) в БД , на вход подаем обьект Admin.
     * Возвращает ID заведенной строки.
     * @param admin  на вход подаем обьект класса Admin.
     * @return id, возвращаем id вставленной строки.
     */
    public Integer insert(Admin admin){
        Integer idAdmin = -1;
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            preparedStatement = insertBaseOne(INSERT);
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setString(2, admin.getUser_name());
            preparedStatement.setString(3, admin.getUser_pass());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                idAdmin = resultSet.getInt(1);
            }
            return idAdmin;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idAdmin;
    }

    /**
     * Метод извлечения всех записей Admin(администратор) из БД.
     * @return Возвращает список обьектов Admin.
     */
    public ArrayList<Admin> getAll() {
        try {
            ResultSet result;
            result = selectBase(GET_ALL);
            ArrayList<Admin> admins = new ArrayList<Admin>();
            while (result.next()) {
                Admin admin = new Admin(result.getInt(1), result.getString(2),
                        result.getString(3));
                admins.add(admin);
            }
            return admins;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Admin>();
    }

    /**
     * Метод извлечения  записи Admin(администратор) из БД.
     * @param id Покупателя, которого извлекаем.
     * @return Возвращает обьек admin по id.
     */
    public Admin getById(Integer id) {
        try {
            ResultSet result;
            //result = selectBase(GET_BY_ID + id);
            result = selectBase("SELECT * FROM public.admin WHERE id=" + id);
            result.next();
            Admin admin = new Admin(result.getInt(1), result.getString(2),
                    result.getString(3));
            return admin;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Admin();
    }

    /**
     * Метод записи обьекта Admin(администратор) в БД.
     * @param admin - обьект класса Admin.
     */
    public void update(Admin admin) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(UPDATE);
            preparedStatement.setString(1, admin.getUser_name());
            preparedStatement.setString(2, admin.getUser_pass());
            preparedStatement.setInt(4, admin.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удаления обьекта Admin(администратор) из БД.
     * @param admin
     */
    public void delete(Admin admin) {
        try {
            PreparedStatement preparedStatement;
            preparedStatement = insertBase(DELETE_BY_ID);
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
