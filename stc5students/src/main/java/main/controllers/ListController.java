package main.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import main.model.pojo.Student;
import main.services.StudentService;
import main.services.StudentServiceImpl;

/**
 *
 */
public class ListController extends HttpServlet {

    private static StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("value", "Hello, student");

        List<Student> students = studentService.getAllStudents();

        req.setAttribute("students", students);

        getServletContext().getRequestDispatcher("/listStudents.jsp")
                .forward(req, resp);
    }
}
