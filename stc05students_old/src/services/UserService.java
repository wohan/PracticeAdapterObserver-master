package services;

import main.controllers.LoginServlet;
import main.controllers.pojo.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by admin on 20.04.2017.
 */
public class UserService {

    static {
        PropertyConfigurator.configure(UserServiceImpl.class
                .getResource("log4j.properties"));
    }

    private static final Logger logger = Logger.getLogger(LoginServlet.class);

}
