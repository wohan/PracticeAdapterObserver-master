//package main.controllers;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import main.models.pojo.Ordering;
//import main.models.pojo.Product;
//import main.service.OrderingService;
//import main.service.OrderingServiceImpl;
//import main.service.ProductService;
//import main.service.ProductServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.context.support.SpringBeanAutowiringSupport;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// *
// */
//
//@Controller
//@RequestMapping(value = "/listBuyer")
//@Service
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//public class ListBuyer extends HttpServlet {
//
//    @Autowired
//    private OrderingServiceImpl orderingService;
//
//    @Autowired
//    private ProductServiceImpl  productSetvice;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
//                config.getServletContext());
//    }
//
////    @Override
////    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////
////        List<Ordering> orderings = orderingService.getAll();
////        List<Product> products = productSetvice.getAll();
////        req.setAttribute("orderings", orderings);
////        req.setAttribute("products", products);
////        req.getRequestDispatcher("/listbuyer.jsp").forward(req, resp);
////
////    }
//
//    @RequestMapping(value = "listbuyer",method = RequestMethod.GET)
//    public ModelAndView getAllProduct(){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("users", orderingService.getAll());
//        mav.setViewName("listbuyer");
//        return mav;
//    }
//
//}
