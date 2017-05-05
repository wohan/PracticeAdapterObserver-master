//package main.controllers;
//import main.service.OrderingServiceImpl;
//import main.service.ProductServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// *
// */
//
//@Controller
////@RequestMapping(value = "/listbuyer")
//public class servlet {
//
//    @Autowired
//    private OrderingServiceImpl orderingService;
//
//    @Autowired
//    private ProductServiceImpl  productSetvice;
////        @Override
////        public void init(ServletConfig config) throws ServletException {
////            super.init(config);
////            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
////                    config.getServletContext());
//
//    //@RequestMapping(method = RequestMethod.GET)
//
//    @RequestMapping(value = "/listbuyer", method = RequestMethod.GET)
//    public ModelAndView showListBuyer() {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("products", productSetvice.getAll());
//        mav.addObject("orderings", orderingService.getAll());
//        //model.addAttribute("listBuyer", productSetvice.getAll());
//
//        //model.addAttribute("listBuyer", orderingService.getAll());
//        return mav;
//    }}
//
////    public ModelAndView getLoginAndPass(){
////        ModelAndView mav = new ModelAndView();
////
////
//////        mav.addObject("users",userService.SelectUsersFromTable());
//////        mav.setViewName("allUsers");
//////        return mav;
////
////
////
////    }
//
//
