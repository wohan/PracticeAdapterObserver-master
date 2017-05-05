package dao;

import controllers.UserServlet;
import models.Student;
import models.User;
import org.apache.log4j.Logger;
import services.DbConnection;

import java.sql.*;

/**
 * Created by PoGo on 20.04.2017.
 */
public class UserDAOImpl implements UserDAO {

    private static final Logger LOGGER = Logger.getLogger(UserServlet.class);

    // throw new NotImplementedException();

    @Override
    public User findUserByLoginAndPassword(String login, String passw) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM public.user WHERE login = ? and passw = ?");
            statement.setString(1, login);
            statement.setString(2, passw);
            ResultSet result = statement.executeQuery();
            User m = null;
            while (result.next()) {
                m = new User(result.getInt("id"), result.getString("login"), result.getString("passw"), result.getBoolean("is_blocked"));
                return m;
            }
            LOGGER.debug("user: " + m);
        } catch (SQLException e) {
            //e.printStackTrace();
            LOGGER.error(e);
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return null;
    }
}
