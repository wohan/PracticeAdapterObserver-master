package dao;

import models.StudyGroup;
import services.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by PoGo on 20.04.2017.
 */
public class StudyGroupDAOImpl implements StudyGroupDAO {
    @Override
    public List<StudyGroup> getAll() {
        List<StudyGroup> res = new LinkedList<>();
        Connection connection = DbConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM public.study_group");
            while (result.next()) {
                StudyGroup m = new StudyGroup(result.getInt("id"), result.getString("name"));
                res.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return res;
    }

    @Override
    public StudyGroup get(Integer id) {
        Connection connection = DbConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM public.study_group WHERE id = " + id.toString());
            while (result.next()) {
                StudyGroup m = new StudyGroup(result.getInt("id"), result.getString("name"));
                return m;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //IProLogger.LOGGER.error(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return null;
    }
}
