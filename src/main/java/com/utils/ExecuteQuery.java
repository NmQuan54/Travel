package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecuteQuery {
    private String query;

    private final static String jdbcUrl = "jdbc:mysql://127.0.0.2:3306/travel";
    private final static String username = "root";
    private final static String password = "quan05042003";

    private static final Logger logger = Logger.getLogger(ExecuteQuery.class.getName());

    public ExecuteQuery(String query) {
        this.query = query;
    }

    public ResultSet executeQuery() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error while executing query: " + e.getMessage(), e);
        }
        return null;
    }

    public void executeUpdate() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error while executing update: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}
