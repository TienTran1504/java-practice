package com.myapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;

public class MySQL {

    private static MySQL instance;

    private MySQL() {
        connectAndProcessData();
    }

    public static MySQL getInstance() {
        if (instance == null) {
            instance = new MySQL();
        }
        return instance;
    }

    // Method to handle the connection and data processing
    private void connectAndProcessData() {
        String url = "jdbc:mysql://localhost:3306/animal";
        String username = "springstudent";
        String password = "springstudent";
        try {
            FileWriter writerDog = new FileWriter("dog_names.txt");
            FileWriter writerCat = new FileWriter("cat_names.txt");

            //Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create statement to execute SQL queries
            Statement statement = connection.createStatement();
            // Execute SQL query and get results
            ResultSet resultSet = statement.executeQuery("SELECT * FROM dogs");

            // Iterate through results and write to file
            while (resultSet.next()) {
                writerDog.write(resultSet.getString("name") + "\n");
                System.out.println("Dog Name: " + resultSet.getString("name"));
            }

            resultSet = statement.executeQuery("SELECT * FROM cats");
            while (resultSet.next()) {
                writerCat.write(resultSet.getString("name") + "\n");
                System.out.println("Cat Name: " + resultSet.getString("name"));
            }

            resultSet.close();
            statement.close();
            connection.close();
            writerCat.close();
            writerDog.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



//  // Create the SQL INSERT query
//             String sql = "INSERT INTO dogs (id, name) VALUES (" + id + ", '" + name + "')";

//             // Execute the INSERT query
//             int rowsAffected = statement.executeUpdate(sql);

//             // Check if the insertion was successful
//             if (rowsAffected > 0) {
//                 System.out.println("A new dog was inserted successfully!");
//             }