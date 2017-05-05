//package main.controllers;
//
//import main.models.pojo.Buyer;
//import main.service.BuyerServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.support.SpringBeanAutowiringSupport;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
///**
// * Created by admin on 26.04.2017.
// */
//
//@Service
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//public class ListAdminServlet extends HttpServlet {
//    @Autowired
//    private BuyerServiceImpl buyerService;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
//                config.getServletContext());
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Buyer> buyers = buyerService.getAll();
//        req.setAttribute("buyers", buyers);
//        req.getRequestDispatcher("/listadmin.jsp").forward(req, resp);
//    }
//}
