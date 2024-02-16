package com.pluralsight.services;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarServices {
    private DataSource dataSource;

    public CarServices() {
        String databaseUrl = "jdbc:mysql://localhost:3306/dealership";
        String userName = "root";
        String password = "rootpass";
        dataSource = new BasicDataSource() {{
            setUrl(databaseUrl);
            setUsername(userName);
            setPassword(password);
        }};
    }

    public void printCarInformation(int dealerId) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM vehicles WHERE dealer_id=?";
            try (PreparedStatement statement = connection.prepareStatement(query))
            {
                statement.setInt(1,dealerId);
                 ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String make = resultSet.getString("make");
                    String model = resultSet.getString("model");
                    int year = resultSet.getInt("year");
                    String type = resultSet.getString("type");
                    String color = resultSet.getString("color");
                    int miles = resultSet.getInt("miles");
                    int price = resultSet.getInt("price");

                    System.out.println("Car: " + year + " " + make + " " + model + " " + type + " " + color + " "+ miles + " " + price);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
