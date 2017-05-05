package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerPassNotTrue {
    @RequestMapping(value = "/passnottrue")
    public String showPassNotTrue(){
        return "passnottrue";
    }


//    @RequestMapping(value = "/passnottrue", method = RequestMethod.GET)
//    public ModelAndView showPassNotTrue() {
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
}
