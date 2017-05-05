package main.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerBuyerExist {
    @RequestMapping(value = "/buyerexist")
    public String showBuyerExis(){
        return "buyerexist";
    }

//    @RequestMapping(value = "/buyerexist", method = RequestMethod.GET)
//    public ModelAndView showBuyerExis() {
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
}
