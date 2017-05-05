//package main.controllers;
//import main.models.pojo.Buyer;
//import main.service.BuyerService;
//import main.service.BuyerServiceImpl;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.support.SpringBeanAutowiringSupport;
//
//import java.io.IOException;
//import java.util.List;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///**
// *
// */
//@Service
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//public class CheckInServlet extends HttpServlet {
//
//    @Autowired
//    private BuyerServiceImpl buyerService;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
//                config.getServletContext());
//    }
//
//    private static final Logger logger = Logger.getLogger(LoginServlet.class);
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/checkin.jsp").forward(req,resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String login = String.valueOf(req.getParameter("login"));
//        String password = String.valueOf(req.getParameter("pass"));
//        String phone = String.valueOf((req.getParameter("phone")));
//        int minLength = 5;
//        if (buyerService.satisfactionLength(login, minLength) &&
//                buyerService.satisfactionLength(password, minLength)&&
//                buyerService.satisfactionLength(phone, minLength)) {
//            Buyer buyer;
//            List<Buyer> buyers;
//            Integer flagAuth;
//            flagAuth = buyerService.passwordVerification(login, buyerService.md5Apache(password));
//            String urlNext = "/login";
//            if (flagAuth == 3) {
//                buyers = buyerService.getAll();
//                int idNewBuyer = buyers.size() + 1;
//                buyer = new Buyer(idNewBuyer, login,
//                        buyerService.md5Apache(password), Integer.valueOf(phone));
//                buyerService.insert(buyer);
//            } else {
//                urlNext = "/buyerexist";
//            }
//            resp.sendRedirect(req.getContextPath() + urlNext);
//        } else {
//            resp.sendRedirect(req.getContextPath() + "/nosatisfaction");
//        }
//    }
//}
