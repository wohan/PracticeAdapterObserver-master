package com.company.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataBaseManaget {


    // Метод установления коннекта с БД
    public Connection initConnection() {
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

    // Метод используеться в методах insert , для записи данных из БД,
    // входящий параметр команда БД для вставки данных в таблицу.
    public PreparedStatement insertBase(String insertInto) throws SQLException {
        Connection connection;
        PreparedStatement preparedStatement;
        connection = initConnection();
        preparedStatement = connection.prepareStatement(insertInto);
        return preparedStatement;
    }


    // Метод добавления записи Buyer(покупатель) в БД , на вход подаем обьект Buyer.
    public void insertBuyer(Buyer buyer){
        try{
            PreparedStatement preparedStatement;
            String insertInto;
            insertInto = "INSERT INTO buyer(\n" + " id, user_name, user_pass, phone)\n" + " VALUES (?,?, ?, ?)";
            preparedStatement = insertBase(insertInto);
            preparedStatement.setInt(1, buyer.getId());
            preparedStatement.setString(2, buyer.getUserName());
            preparedStatement.setString(3, buyer.getUserPass());
            preparedStatement.setInt(4, buyer.getPhone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод добавления записи Ordering(заказ) в БД , на вход подаем обьект Ordering.
    public void insertOrdering(Ordering ordering){
        try {
            PreparedStatement preparedStatement;
            String insertInto;
            insertInto = "INSERT INTO ordering(\n" + " id, id_buyer, data, description)\n" + " VALUES (?,?, ?, ?)";
            preparedStatement = insertBase(insertInto);
            preparedStatement.setInt(1, ordering.getIdBuyer());
            preparedStatement.setInt(2, ordering.getId());
            preparedStatement.setInt(3, ordering.getData());
            preparedStatement.setString(4, ordering.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод добавления записи Product(продукт) в БД , на вход подаем обьект Product.
    public void insertProduct(Product product) {
        try {
            PreparedStatement preparedStatement;
            String insertInto;
            insertInto = "INSERT INTO product(\n" + " id, id_ordering, name, price, quantity)\n" + " VALUES (?,?, ?, ?,?)";
            preparedStatement = insertBase(insertInto);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getIdOrdering());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(5, product.getQuantity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод добавления записи Admin(администратора) в БД , на вход подаем обьект Product.
    public void insertAdmin (Admin admin) {
        try {
            PreparedStatement preparedStatement;
            String insertInto;
            insertInto = "INSERT INTO admin(\n" + "id, user_name, user_pass)\n" + " VALUES (?,?,?)";
            preparedStatement = insertBase(insertInto);
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setString(2, admin.getUserName());
            preparedStatement.setString(3, admin.getUserPass());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод используеться в методах select , для возвращеня данных из БД, входящий параметр команда БД для выборки таблиц.
    public ResultSet selectBase(String selectFrom) throws SQLException {
        Connection connection;
        Statement statement;
        ResultSet result;
        connection = initConnection();
        statement = connection.createStatement();
        result = statement.executeQuery(selectFrom);
        return result;
    }

    // Метод извлечения всех записей Buyer(покупатель) из БД. Возвращает список обьектов Buyer.
    public ArrayList<Buyer> selectBuyer() {
        try {
            ResultSet result;
            String selectFrom;
            selectFrom = "select * from public.buyer";
            result = selectBase(selectFrom);
            ArrayList<Buyer> buyers = new ArrayList<>();
            while (result.next()) {
                Buyer buyer = new Buyer();
                buyer.setId(result.getInt(1));
                buyer.setUserName(result.getString(2));
                buyer.setUserPass(result.getString(3));
                buyer.setPhone(result.getInt(4));
                buyers.add(buyer);
            }
            return buyers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Buyer>();
    }

    // Метод извлечения всех записей Ordering(заказ) из БД. Возвращает список обьектов Ordering.
    public ArrayList<Ordering> selectOrdering() {
        try {
            String selectFrom;
            selectFrom = "select * from public.ordering";
            ResultSet result = selectBase (selectFrom);
            ArrayList<Ordering> orderings = new ArrayList<>();
            while (result.next()) {
                Ordering ordering = new Ordering();
                ordering.setId(result.getInt(1));
                ordering.setIdBuyer(result.getInt(2));
                ordering.setData(result.getInt(3));
                ordering.setDescription(result.getString(4));
                orderings.add(ordering);
            }
            return orderings;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Ordering>();
    }

    // Метод извлечения всех записей Product(продукты) из БД. Возвращает список обьектов Product.
    public List<Product> selectProduct() {
        try {
            String selectFrom;
            selectFrom = "select * from public.product";
            ResultSet result = selectBase (selectFrom);
            List<Product> products = new ArrayList<>();
            products = new ArrayList<>();
            while (result.next()) {
                Product product = new Product();
                product.setId(result.getInt(1));
                product.setIdOrdering(result.getInt(2));
                product.setName(result.getString(3));
                product.setPrice(result.getInt(4));
                product.setQuantity(result.getInt(5));
                products.add(product);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Product>();
    }

    // Метод извлечения всех записей Admin(администраторы) из БД. Возвращает список обьектов Admin.
    public List<Admin> selectAdmin() {
        try {
            String selectFrom;
            selectFrom = "select * from public.admin";
            ResultSet result;
            result = selectBase (selectFrom);
            List<Admin> admins;
            admins = new ArrayList<>();
            while (result.next()) {
                Admin admin = new Admin();
                admin.setAdmin(result.getInt(1),
                        result.getString(2), result.getString(3));
                admins.add(admin);
            }
            return admins;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Admin>();
    }


}