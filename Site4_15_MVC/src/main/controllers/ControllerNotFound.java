package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerNotFound {
    @RequestMapping(value = "/buyernotfound")
    public String showBuyerNotFound(){
        return "buyernotfound";
    }


//    @RequestMapping(value = "/buyernotfound", method = RequestMethod.GET)
//    public ModelAndView showBuyerNotFound() {
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
}
