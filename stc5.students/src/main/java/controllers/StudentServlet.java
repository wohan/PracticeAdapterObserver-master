package controllers;

import dao.StudentDAOImpl;
import models.Student;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import services.StudentService;
import services.StudentServiceInterface;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by PoGo on 18.04.2017.
 */
public class StudentServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(StudentServlet.class);

    private static StudentServiceInterface studentService = new StudentService();

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = null;
        if (tryParseInt((String) req.getParameter("edit")) ){
            id = Integer.parseInt((String) req.getParameter("edit"));
            req.setAttribute("student", studentService.get(id));
            getServletContext().getRequestDispatcher("/StudentForm.jsp").forward(req, resp);
        } else if (req.getParameter("add") != null) {
            req.setAttribute("student", studentService.create());
            getServletContext().getRequestDispatcher("/StudentForm.jsp").forward(req, resp);
        } else if (tryParseInt((String) req.getParameter("delete")) ) {
            id = Integer.parseInt((String) req.getParameter("delete"));
            studentService.delete(id);
            resp.sendRedirect(req.getContextPath() + "/students/");
        } else {
            req.setAttribute("students", studentService.getAllStudents());
            getServletContext().getRequestDispatcher("/StudentList.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        try {
            Integer id = null;
            if (tryParseInt(req.getParameter("id"))) {
                id = Integer.parseInt(req.getParameter("id"));
            }
            studentService.save(
                    id,
                    req.getParameter("name"),
                    Integer.parseInt(req.getParameter("age")),
                    Integer.parseInt(req.getParameter("group_id"))
            );
        } catch (NumberFormatException e) {
            LOGGER.error("error in parameters");
        }
        resp.sendRedirect(req.getContextPath() + "/students/");
    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
