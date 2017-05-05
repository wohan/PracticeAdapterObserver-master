package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by PoGo on 19.04.2017.
 */
public class DbConnection {
    //private static Logger logger = Logger.getLogger(AcademConnector.class);

    private static Connection connection;

    private static DbConnection ourInstance = new DbConnection();

    public static DbConnection getInstance() {
        return ourInstance;
    }

    private DbConnection() {
    }

    /**Возвращает подключение к БД
     * @return connection
     */
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/student", "ipro", "ipro");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
