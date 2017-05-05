package main.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by admin on 03.05.2017.
 */
@Controller
public class ControllerNoSatisfaction {
    @RequestMapping(value = "/nosatisfaction")
    public String showNoSatisfaction() {
        return "nosatisfaction";
    }
}
