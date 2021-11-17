package net.codejava;

import java.sql.*;

public class BatchInsertApp {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "INSERT INTO product (name, brand, madein, price) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 1; i <= 10; i++) {
                String name = "Name-" + i;
                String brand = "Brand-" + i;
                String madein = "Madein-" + i;
                float price = 1000f;

                statement.setString(1, name);
                statement.setString(2, brand);
                statement.setString(3, madein);
                statement.setFloat(4, price);

                statement.addBatch();

            }

            statement.executeBatch();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}