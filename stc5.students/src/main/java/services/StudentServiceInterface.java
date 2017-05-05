package services;

import models.Student;

import java.util.List;

/**
 * Created by PoGo on 19.04.2017.
 */
public interface StudentServiceInterface {

    public List<Student> getAllStudents();

    public Student get(Integer id);

    public void delete(Integer id);

    public Student create();

    public void save(Integer id, String name, Integer age, Integer groupId);

}
