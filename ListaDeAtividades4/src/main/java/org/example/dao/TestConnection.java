package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ListaDeAtividades4",
                    "root",
                    "_43690"
            );
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}