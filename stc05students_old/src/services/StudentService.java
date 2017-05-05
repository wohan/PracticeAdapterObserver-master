package services;

import main.controllers.pojo.Student;

import java.awt.*;

/**
 * Created by admin on 19.04.2017.
 */
public class StudentService implements StudentServiceInterface  {
    public static StudentInterface studentDAO = new StudentDAO();
    public List<Student> = getAllStudents(){
        return studentDAO.getAll();
    }
}
