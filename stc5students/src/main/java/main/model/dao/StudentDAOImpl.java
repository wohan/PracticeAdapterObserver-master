package main.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import main.model.ConnectionPool;
import main.model.pojo.Group;
import main.model.pojo.Student;

/**
 *
 */
@SuppressWarnings("Duplicates")
public class StudentDAOImpl implements StudentDAO {

    private static final String SELECT_ALL = "SELECT id, name, age, group_id FROM student";

    private static final String INSERT_INTO = "INSERT INTO student (name, age, group_id) VALUES (?, ?, ?)";
    private static final String UPDATE_WHERE = "UPDATE student SET name = ?, age = ?, group_id = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM student WHERE id=?";

    @Override
    public Collection<Student> getAll() {
        Set<Student> entities = new HashSet<>();

        try (Connection connection = ConnectionPool.getInstance().getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                entities.add(createEntity(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }


    @Override
    public Student getById(Long id) {
        Student student = null;

        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement statement = connection
                     .prepareStatement(SELECT_ALL + " WHERE id = ?")) {

            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = createEntity(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

    @Override
    public Long insert(Student entity) {
        long result = -1;
        try (Connection connection = ConnectionPool.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(INSERT_INTO,
                Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, entity.getName());
            statement.setInt(2, entity.getAge());
            statement.setLong(3, entity.getGroupId());
            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                result = resultSet.getLong(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void update(Student entity) {
        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement statement = connection
                     .prepareStatement(UPDATE_WHERE)) {
            statement.setString(1, entity.getName());
            statement.setInt(2, entity.getAge());
            statement.setLong(3, entity.getGroupId());
            statement.setLong(4, entity.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Student entity) {
        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement statement = connection
                     .prepareStatement(DELETE_BY_ID)) {

            statement.setLong(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Student createEntity(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getLong("id"));
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));
        student.setGroupId(resultSet.getLong("group_id"));

        Group group = new GroupDAOImpl().getById(student.getGroupId());
        student.setGroup(group);

        return student;
    }
}
