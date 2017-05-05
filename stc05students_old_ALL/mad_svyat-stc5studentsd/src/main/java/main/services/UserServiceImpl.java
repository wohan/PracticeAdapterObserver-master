package main.services;

import org.apache.log4j.Logger;

import main.model.dao.UserDAO;
import main.model.dao.UserDAOImpl;
import main.model.pojo.User;

/**
 *
 */
public class UserServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

    private static UserDAO userDAO = new UserDAOImpl();

    @Override
    public User auth(String login, String password) {
        User user = userDAO.findUserByLoginAndPassword(login, password);
        logger.debug("user: " + user);

        if (user != null && user.isBlocked()) {
            return null;
        }
        logger.debug("user not blocked");

        return user;
    }
}
