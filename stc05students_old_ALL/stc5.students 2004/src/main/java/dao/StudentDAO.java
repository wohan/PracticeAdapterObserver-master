package dao;

import models.Student;

import java.util.List;

/**
 * Created by PoGo on 19.04.2017.
 */
public interface StudentDAO {
    public List<Student> getAll();
    public Student get(Integer id);
    public void save(Student student);
    public void delete(Integer id);
    public Student create();
}
