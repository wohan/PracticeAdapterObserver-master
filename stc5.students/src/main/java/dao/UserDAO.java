package dao;

import models.User;

/**
 * Created by PoGo on 20.04.2017.
 */
public interface UserDAO {

    User findUserByLoginAndPassword(String login, String passw);

}
