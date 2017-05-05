package main.models.dao;

//import org.apache.log4j.Logger;

import main.models.ConnectionPool;
import main.models.pojo.Admin;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 */

public abstract class AdminDAOImpl implements main.models.dao.AdminDAO {

    //private static final Logger logger = Logger.getLogger(AdminDAOImpl.class);

    //@Override
    public Collection<Admin> getAll() {
        throw new NotImplementedException();
    }

    ///@Override
    public Admin getById(Long id) {
        throw new NotImplementedException();
    }

    //@Override
    public Integer insert(Admin entity) {
        throw new NotImplementedException();
    }

    //@Override
    public void update(Admin entity) {
        throw new NotImplementedException();
    }

    //@Override
    public void delete(Admin entity) {
        throw new NotImplementedException();
    }

    //@Override
    public Admin findUserByLoginAndPassword(String login, String password) {
        Admin admin = null;

        try{
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement statement = connection
                    .prepareStatement( "SELECT * FROM id WHERE user_name = ? AND user_pass = ?");
            statement.setString(1, "user_name");
            statement.setString(2, "user_pass");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                admin = createEntity(resultSet);
            }

           // logger.debug("user " + admin);
        } catch (SQLException e) {
          //  logger.error(e);
        }

        return admin;
    }

    private Admin createEntity(ResultSet resultSet) throws SQLException {
        return new Admin(resultSet.getInt("id"),
                resultSet.getString("user_name"),
                resultSet.getString("user_pass"));
    }
}
