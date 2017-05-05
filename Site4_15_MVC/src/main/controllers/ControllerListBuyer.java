package main.controllers;
import main.service.OrderingServiceImpl;
import main.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerListBuyer {

    @Autowired
    private OrderingServiceImpl orderingService;

    @Autowired
    private ProductServiceImpl  productSetvice;

    @RequestMapping(value = "/listbuyer", method = RequestMethod.GET)
    public ModelAndView showListBuyer() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("products", productSetvice.getAll());
        mav.addObject("orderings", orderingService.getAll());
        mav.setViewName("/listbuyer");
        return mav;
    }
}


