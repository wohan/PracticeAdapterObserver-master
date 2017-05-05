//package main.controllers;
//import main.service.AdminService;
//import main.service.AdminServiceImpl;
//
//import java.io.IOException;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import main.service.BuyerServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.support.SpringBeanAutowiringSupport;
//
///**
// *
// */
//@Service
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//public class LoginServlet extends HttpServlet {
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
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String login;
//        String password;
//        String HeshPassword;
//        login = String.valueOf(req.getParameter("login"));
//        password = String.valueOf(req.getParameter("pass"));
//        Integer flagAuth;
//        HeshPassword = buyerService.md5Apache(password);
//        flagAuth = buyerService.passwordVerification(login, HeshPassword);
//        String urlNext = "/login";
//        if (flagAuth==1)  urlNext = "/listbuyer";
//        if (flagAuth==2)  urlNext = "/passnottrue";
//        if (flagAuth==3){
//            AdminService adminService;
//            adminService = new AdminServiceImpl();
//            Integer flagAuthAdmin;
//            flagAuthAdmin = adminService.passwordVerification(login, HeshPassword);
//            if (flagAuthAdmin==1)  urlNext = "/listadmin";
//            if (flagAuthAdmin==2)  urlNext = "/passnottrue";
//            if (flagAuthAdmin==3)  urlNext = "/buyernotfound";
//        }
//        req.getSession().setAttribute("urlNext", urlNext);
//        resp.sendRedirect(req.getContextPath() + urlNext);
//    }
//}
//
//
//
//
//
