package services;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import models.Student;

import java.util.List;

/**
 * Created by PoGo on 19.04.2017.
 */
public class StudentService implements StudentServiceInterface {

    public static StudentDAO studentDAO = new StudentDAOImpl();

    public List<Student> getAllStudents() {
        return studentDAO.getAll();
    }

    @Override
    public Student get(Integer id) {
        return studentDAO.get(id);
    }

    @Override
    public void delete(Integer id) {
        studentDAO.delete(id);
    }

    @Override
    public Student create() {
        return studentDAO.create();
    }

    @Override
    public void save(Integer id, String name, Integer age, Integer groupId) {
        Student student = new Student(id, name, age, groupId);
        studentDAO.save(student);
    }
}
