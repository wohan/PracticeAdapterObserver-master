package main.model.dao;

import main.model.pojo.User;

/**
 *
 */
public interface UserDAO extends DAO<Long, User> {

    User findUserByLoginAndPassword(String login, String password);
}
