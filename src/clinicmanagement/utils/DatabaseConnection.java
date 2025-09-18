package clinicmanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is responsible for creating a connection to the MySQL database.
 * It provides a single static method to get a new connection.
 */
public class DatabaseConnection {

    // Constants for database connection details.
    // URL: The address of the database server. "clinic_management" is the database name.
    // USER: The default username for XAMPP is "root".
    // PASSWORD: The default password for XAMPP is empty "".
    private static final String URL = "jdbc:mysql://localhost:3306/clinic_management";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    /**
     * Attempts to establish a connection to the database.
     * This is a static method, so it can be called directly without creating an instance of the class.
     * @return a Connection object to the database.
     * @throws SQLException if a database access error occurs.
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Step 1: Load the MySQL JDBC driver.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Return the established connection.
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // This error happens if the MySQL Connector JAR is missing.
            throw new SQLException("MySQL JDBC Driver not found!", e);
        }
    }
}

