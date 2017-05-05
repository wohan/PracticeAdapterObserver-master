package main.controllers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import services.UserService;
import services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 19.04.2017.
 */
public class LoginServlet extends HttpServlet {

    static {
        PropertyConfigurator.configure(LoginServlet.class
                .getResource("log4j.properties"));
    }

    private static final Logger logger = Logger.getLogger(LoginServlet.class);

    protected void doGet (HttpServletRequest req, HttpServletResponse resp){
        try {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void  doPost(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        if ("user".equals(login)&& "pass".equals(pass)) {
            try {
                resp.sendRedirect(req.getContextPath() + "/ListStudents");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.debug(login);
        }
        else {
            try {
                resp.sendRedirect("/error");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static UserService userService = new UserServiceImpl();


}
