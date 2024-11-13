package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.example.models.Album;

public class AlbumDAO {
    public void salvarAlbum(Album album) throws SQLException {
        String sql = "INSERT INTO albuns (titulo, artista, ano) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, album.getTitulo());
            stmt.setString(2, album.getInterprete());
            stmt.setDate(3, java.sql.Date.valueOf(album.getDataLancamento()));
            stmt.executeUpdate();
        }
    }

    public Album buscarAlbum(int id) throws SQLException {
        String sql = "SELECT * FROM albuns WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Album(
                            rs.getString("titulo"),
                            rs.getDate("ano").toLocalDate(),
                            rs.getString("artista")
                    );
                }
            }
        }
        return null; // Retorna null caso não encontre o álbum
    }
}
