package org.example.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.example.models.Album;

public class AlbumDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/ListaDeAtividades4";
    private static final String USER = "root";
    private static final String PASSWORD = "_43690";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);}

    public void salvarAlbum(Album album) throws SQLException {
        String sql = "INSERT INTO Album (nome, interprete, dataDeLancamento, capa) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, album.getTitulo());
            stmt.setString(2, album.getInterprete());
            stmt.setDate(3, Date.valueOf(album.getDataLancamento()));
            stmt.setString(4, album.getCapa());
            stmt.executeUpdate();
        }
    }

    public void ListarAlbum() throws SQLException {
        String sql = "SELECT * FROM Album";
    }

    public List<String> listarAlbuns() {
        List<String> albuns = new ArrayList<>();
        String sql = "SELECT nome FROM album";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                albuns.add(resultSet.getString("nome"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return albuns;
    }


    public Album buscarAlbumPorNome(String nome) {
        Album album = null;
        String sql = "SELECT * FROM Album WHERE nome = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, nome);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String interprete = resultSet.getString("interprete");
                LocalDate dataLancamento = resultSet.getDate("dataDeLancamento").toLocalDate();
                String capa = resultSet.getString("capa");

                album = new Album(nome, dataLancamento, interprete, capa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return album;
    }

    public boolean excluirAlbum(String nome) {
        String sql = "DELETE FROM Album WHERE nome = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, nome);
            int rowsAffected = preparedStatement.executeUpdate(); // Executa o DELETE e retorna o número de linhas afetadas

            return rowsAffected > 0; // Retorna true se pelo menos uma linha foi excluída
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Retorna false caso ocorra algum problema
    }

}