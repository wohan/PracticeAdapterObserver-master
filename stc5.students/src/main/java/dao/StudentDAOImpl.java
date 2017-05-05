package dao;

import models.Student;
import services.DbConnection;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by PoGo on 19.04.2017.
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> getAll() {
        List<Student> res = new LinkedList<>();
        Connection connection = DbConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM public.student");
            while (result.next()) {
                Student m = new Student(result.getInt("id"), result.getString("name"),
                        result.getInt("group_id"), result.getInt("age"));
                res.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return res;
    }

    @Override
    public Student get(Integer id) {
        Connection connection = DbConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM public.student WHERE id = " + id.toString());
            while (result.next()) {
                Student m = new Student(result.getInt("id"), result.getString("name"),
                        result.getInt("group_id"), result.getInt("age"));
                return m;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public void save(Student student) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement statement;
            if (student.getId() == null) {
                statement = connection.prepareStatement("INSERT INTO public.student (name, age, group_id) VALUES (?, ?, ?)");
            } else {
                statement = connection.prepareStatement("UPDATE public.student SET name = ?, age = ?, group_id = ? WHERE id = ?");
                statement.setInt(4, student.getId());
            }
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setInt(3, student.getGroupId());
            statement.executeUpdate();
        } catch (SQLException e) {
            //e.printStackTrace();
            //LOGGER.error(e);
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public void delete(Integer id) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM public.student WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            //e.printStackTrace();
            //LOGGER.error(e);
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public Student create() {
        return new Student(null, null, null, null);
    }
}
