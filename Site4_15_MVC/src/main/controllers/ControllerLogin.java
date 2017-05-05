package main.controllers;

import main.service.AdminServiceImpl;
import main.service.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerLogin {

    @Autowired
    private BuyerServiceImpl buyerService;

    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/login");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView goLogin(@RequestParam(value = "login", required = true) String login,
                              @RequestParam(value = "pass", required = true) String password) {
        ModelAndView mav = new ModelAndView();
        String HeshPassword;
        Integer flagAuth;
        HeshPassword = buyerService.md5Apache(password);
        flagAuth = buyerService.passwordVerification(login, HeshPassword);
        String urlNext = "/login";
        if (flagAuth==1)  urlNext = "/listbuyer";
        if (flagAuth==2)  urlNext = "/passnottrue";
        if (flagAuth==3){
            Integer flagAuthAdmin;
            flagAuthAdmin = adminService.passwordVerification(login, HeshPassword);
            if (flagAuthAdmin==1)  urlNext = "/listadmin";
            if (flagAuthAdmin==2)  urlNext = "/passnottrue";
            if (flagAuthAdmin==3)  urlNext = "/buyernotfound";
        }
        mav.setViewName("redirect:" + urlNext);
        return mav;
    }

}
