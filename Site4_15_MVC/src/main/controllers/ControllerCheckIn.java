package main.controllers;

import main.models.pojo.Buyer;
import main.service.AdminServiceImpl;
import main.service.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerCheckIn {

    @Autowired
    private BuyerServiceImpl buyerService;

    @RequestMapping(value = "/checkin", method = RequestMethod.GET)
    public ModelAndView showCheckIn() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @RequestMapping(value = "/checkin", method = RequestMethod.POST)
    public ModelAndView gologin(@RequestParam(value = "login", required = true) String login,
                                @RequestParam(value = "password", required = true) String password,
                                @RequestParam(value = "phone", required = true) String phone) {
        ModelAndView mav = new ModelAndView();
        int minLength = 5;
        if (buyerService.satisfactionLength(login, minLength) &&
                buyerService.satisfactionLength(password, minLength) &&
                buyerService.satisfactionLength(phone, minLength)) {
            Buyer buyer;
            List<Buyer> buyers;
            Integer flagAuth;
            flagAuth = buyerService.passwordVerification(login, buyerService.md5Apache(password));
            String urlNext = "/login";
            if (flagAuth == 3) {
                buyers = buyerService.getAll();
                int idNewBuyer = buyers.size() + 1;
                buyer = new Buyer(idNewBuyer, login,
                        buyerService.md5Apache(password), Integer.valueOf(phone));
                buyerService.insert(buyer);
            } else {
                urlNext = "/buyerexist";
            }
            mav.setViewName(urlNext);
        } else {
            mav.setViewName("/nosatisfaction");
        }
        return mav;
    }
}
