package services;

import models.User;

/**
 * Created by PoGo on 20.04.2017.
 */
public interface UserService {

    User auth(String login, String passw);
}
