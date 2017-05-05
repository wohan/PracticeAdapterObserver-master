package main.controllers;
import main.service.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerListAdmin {

    @Autowired
    private BuyerServiceImpl buyerService;

    @RequestMapping(value = "/listadmin", method = RequestMethod.GET)
    public ModelAndView showListAdmin() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("buyers", buyerService.getAll());
        return mav;
    }
}

