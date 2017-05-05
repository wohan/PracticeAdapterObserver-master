package main.controllers;

import main.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Olesya on 27.04.2017.
 */
@Controller
@RequestMapping(value = "/list")
public class ListController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String showList(Model model) {
        model.addAttribute("list", studentService.getAllStudents());
        return "list";
    }
}
