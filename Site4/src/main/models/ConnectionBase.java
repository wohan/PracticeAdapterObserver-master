package main.models;

import java.sql.*;

/**
 * Created by admin on 22.04.2017.
 */
public class ConnectionBase {

    // Метод установления коннекта с БД
   static public Connection initConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection =
                    DriverManager.getConnection(
                            "jdbc:postgresql://localhost:5432/Store",
                            "postgres", "mamont");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    static public ResultSet selectBase(String selectFrom) throws SQLException {
        Connection connection;
        Statement statement;
        ResultSet result;
        connection = initConnection();
        statement = connection.createStatement();
        result = statement.executeQuery(selectFrom);
        return result;
    }

    static public PreparedStatement insertBase(String insertInto) throws SQLException {
        Connection connection;
        PreparedStatement preparedStatement;
        connection = initConnection();
        preparedStatement = connection.prepareStatement(insertInto);
        return preparedStatement;
    }
    //Statement.RETURN_GENERATED_KEYS
    static public PreparedStatement insertBaseOne (String insertInto) throws SQLException {
        Connection connection;
        PreparedStatement preparedStatement;
        connection = initConnection();
        preparedStatement = connection.prepareStatement(insertInto, Statement.RETURN_GENERATED_KEYS);
        return preparedStatement;
    }

}
