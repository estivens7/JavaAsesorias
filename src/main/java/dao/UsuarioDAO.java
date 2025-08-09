package dao;

import config.DBConnection;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public Usuario login(String correo, String contrasena) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE correo_electronico=? AND contrasena=?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, correo);
            stmt.setString(2, contrasena);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo_electronico(rs.getString("correo_electronico"));
                usuario.setRol(rs.getString("rol"));
                usuario.setFoto_perfil(rs.getString("foto_perfil"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
