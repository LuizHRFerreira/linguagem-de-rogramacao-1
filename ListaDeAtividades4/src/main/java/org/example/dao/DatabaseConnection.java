package org.example.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ListaDeAtividades4"; // Ajuste para o seu banco
    private static final String USER = "root";
    private static final String PASSWORD = "_43690";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
