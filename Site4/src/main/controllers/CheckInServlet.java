package main.controllers;
import main.models.pojo.Buyer;
import main.service.BuyerService;
import main.service.BuyerServiceImpl;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public class CheckInServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(LoginServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/checkin.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = String.valueOf(req.getParameter("login"));
        String password = String.valueOf(req.getParameter("pass"));
        Integer phone = Integer.valueOf(req.getParameter("phone"));
        BuyerService buyerService;
        Buyer buyer;
        List<Buyer> buyers;
        buyerService = new BuyerServiceImpl();
        Integer flagAuth = buyerService.passwordVerification(login, password);
        String urlNext = "/login";
        if(flagAuth == 3) {
            buyers = buyerService.getAll();
            int idNewBuyer = buyers.size()+1;
            buyer = new Buyer(idNewBuyer, login, password, phone);
            buyerService.insert(buyer);
        } else {
            urlNext = "/buyerexist";
        }
        resp.sendRedirect(req.getContextPath() + urlNext);
    }
}
