package main.services;

import main.model.pojo.User;

/**
 *
 */
public interface UserService {

    User auth(String login, String password);
}
