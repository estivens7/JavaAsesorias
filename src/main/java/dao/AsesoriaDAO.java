package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Asesoria;

public class AsesoriaDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/sistema_asesorias?useSSL=false&allowPublicKeyRetrieval=true";
    private String dbUser = "root";
    private String dbPassword = "root";

    public List<Asesoria> listarPorUsuario(int idUsuario) {
        List<Asesoria> lista = new ArrayList<>();

        String sql = "SELECT a.id_asesoria, h.fecha, h.hora_inicio, h.hora_fin, " +
                     "p_u.nombre AS nombre_profesor, a.estado, a.comentario, a.valoracion " +
                     "FROM asesoria a " +
                     "JOIN estudiante e ON a.id_estudiante = e.id_estudiante " +
                     "JOIN usuario u ON e.id_usuario = u.id_usuario " +
                     "JOIN horario h ON a.id_horario = h.id_horario " +
                     "JOIN profesor p ON h.id_profesor = p.id_profesor " +
                     "JOIN usuario p_u ON p.id_usuario = p_u.id_usuario " +
                     "WHERE u.id_usuario = ?";

        try (Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            stmt.setInt(1, idUsuario);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Asesoria a = new Asesoria();
                    a.setIdAsesoria(rs.getInt("id_asesoria"));
                    a.setFecha(rs.getDate("fecha"));
                    a.setHoraInicio(rs.getTime("hora_inicio"));
                    a.setHoraFin(rs.getTime("hora_fin"));
                    a.setNombreProfesor(rs.getString("nombre_profesor"));
                    a.setEstado(rs.getString("estado"));
                    a.setComentario(rs.getString("comentario"));
                    a.setValoracion((Integer) rs.getObject("valoracion"));

                    lista.add(a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
