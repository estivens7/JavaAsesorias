package controlador;

import dao.AsesoriaDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.Asesoria;

import java.io.IOException;
import java.util.List;

@WebServlet("/AsesoriaServlet")
public class AsesoriaServlet extends HttpServlet {
    private AsesoriaDAO asesoriaDAO = new AsesoriaDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        if (usuario == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<Asesoria> asesorias = asesoriaDAO.listarPorUsuario(usuario.getId_usuario());
        request.setAttribute("asesorias", asesorias);

        RequestDispatcher dispatcher = request.getRequestDispatcher("asesorias.jsp");
        dispatcher.forward(request, response);
    }
}
