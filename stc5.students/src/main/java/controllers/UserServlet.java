package controllers;

import org.apache.log4j.PropertyConfigurator;
import services.UserService;
import services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Created by PoGo on 19.04.2017.
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(UserServlet.class);

    private static UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String passw = request.getParameter("passw");
        if (userService.auth(login, passw) != null) {
            request.getSession().setAttribute("userLogin", login);
            LOGGER.debug("user : " + login);
            response.sendRedirect(request.getContextPath() + "/students/");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
