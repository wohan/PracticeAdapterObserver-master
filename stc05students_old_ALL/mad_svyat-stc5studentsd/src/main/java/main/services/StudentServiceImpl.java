package main.services;

import java.util.ArrayList;
import java.util.List;

import main.model.dao.StudentDAO;
import main.model.dao.StudentDAOImpl;
import main.model.pojo.Student;

/**
 *
 */
public class StudentServiceImpl implements StudentService {

    private static StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.addAll(studentDAO.getAll());
        return students;
    }
}
