package services;

import dao.UserDAO;
import dao.UserDAOImpl;
import models.User;
import org.apache.log4j.Logger;


/**
 * Created by PoGo on 20.04.2017.
 */
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

    private static UserDAO userDAO = new UserDAOImpl();

    @Override
    public User auth(String login, String passw) {
        User user = userDAO.findUserByLoginAndPassword(login, passw);
        if (user != null && user.isBlocked()) {
            return null;
        } else {
            return user;
        }
    }

}
