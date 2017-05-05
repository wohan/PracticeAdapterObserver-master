package main.controllers;

import main.controllers.pojo.Student;
import services.StudentService;
import services.StudentServiceInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 19.04.2017.
 */
public class ListControllers extends HttpServlet {
    private static StudentServiceInterface studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("value","Hello, Student!");
        req.setAttribute("list", studentService.getAllStudents());
        getServletContext().getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}


