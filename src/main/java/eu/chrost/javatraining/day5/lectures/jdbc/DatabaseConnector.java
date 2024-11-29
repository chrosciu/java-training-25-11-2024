package eu.chrost.javatraining.day5.lectures.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/hr"; // URL połączenia JDBC do PostgreSQL
        String user = "admin"; // Nazwa użytkownika bazy danych PostgreSQL
        String password = "admin"; // Hasło użytkownika bazy danych
        return DriverManager.getConnection(url, user, password);
    }

}

