package main.controllers;
import main.service.AdminService;
import main.service.AdminServiceImpl;
import org.apache.log4j.Logger;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.service.BuyerService;
import main.service.BuyerServiceImpl;

/**
 *
 */
public class LoginServlet extends HttpServlet {


    private static final Logger logger = Logger.getLogger(LoginServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BuyerService buyerService;
        buyerService = new BuyerServiceImpl();
        String login;
        String password;
        login = String.valueOf(req.getParameter("login"));
        password = String.valueOf(req.getParameter("pass"));
        Integer flagAuth = buyerService.passwordVerification(login, password);
            //String urlNext = "/login";
        Integer urlNext = 1;
        if (flagAuth==1){
            req.setAttribute("urlNext", 1);
            resp.sendRedirect(req.getContextPath() + "/listbuyer");
        }
            //urlNext = 3;//urlNext = "/listbuyer";
        if (flagAuth==2)  resp.sendRedirect(req.getContextPath() + "/passnottrue"); //urlNext = 1;//urlNext = "/passnottrue";
        if (flagAuth==3){
            AdminService adminService;
            adminService = new AdminServiceImpl();
            Integer flagAuthAdmin = adminService.passwordVerification(login, password);
            if (flagAuthAdmin==1)  {
                req.setAttribute("urlNext", 2);
                resp.sendRedirect(req.getContextPath() + "/listadmin");
            }

            //urlNext = 4; //urlNext = "/listadmin";
            if (flagAuthAdmin==2)  resp.sendRedirect(req.getContextPath() + "/passnottrue");
            //urlNext = 1; //urlNext = "/passnottrue";
            if (flagAuthAdmin==3)  resp.sendRedirect(req.getContextPath() + "/buyernotfound");
            //urlNext = 2; //urlNext = "/buyernotfound";
        }

            //urlNext = "/buyernotfound";

        req.setAttribute("urlNext", urlNext);
        resp.sendRedirect(req.getContextPath() + urlNext);
    }
}





