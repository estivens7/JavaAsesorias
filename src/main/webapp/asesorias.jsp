<%@ page import="java.util.List" %>
<%@ page import="modelo.Asesoria" %>
<%@ page import="modelo.Usuario" %>

<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return;
    }
    List<Asesoria> asesorias = (List<Asesoria>) request.getAttribute("asesorias");
%>

<html>
    <head>
        <title>Bienvenido</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
    </head>
    <body>
        <header>
            <div class="header-left">
                <img src="imagenes/casa.png" alt="Logo" id="menuToggle" style="cursor: pointer;">
            </div>
            <h1>Sistema de Asesorías (Usuario)</h1>
            <nav id="menu" class="menu-desplegable oculto">
                <ul>

                    <li><a href="index.jsp">Salir</a></li>
                </ul>
            </nav>
        </header>
        <h2>Bienvenido, <%= usuario.getNombre()%>!</h2>
        <p>Tu rol es: <%= usuario.getRol()%></p>
        <div class="container">

            <div class="contenedor-seleccion">
                <h2>ASESORÍAS AGENDADAS</h2>
                <p class="subtitulo">Listado de tus asesorías</p>
                <style>
                    .tabla-asesorias {
                        width: 100%;
                        border-collapse: collapse;
                        font-family: Arial, sans-serif;
                        font-size: 14px;
                        background-color: #fff;
                        border-radius: 8px;
                        overflow: hidden;
                        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
                    }

                    .tabla-asesorias thead {
                        background-color: #2c3e50;
                        color: white;
                        text-align: left;
                    }

                    .tabla-asesorias th,
                    .tabla-asesorias td {
                        padding: 12px 15px;
                        border-bottom: 1px solid #ddd;
                    }

                    .tabla-asesorias tbody tr:nth-child(even) {
                        background-color: #f9f9f9;
                    }

                    .tabla-asesorias tbody tr:hover {
                        background-color: #f1f1f1;
                    }

                    .tabla-asesorias td {
                        color: #333;
                    }
                </style>
                <table class="tabla-asesorias">
                    <thead>
                        <tr>
                            <th>ID Asesoría</th>
                            <th>Fecha</th>
                            <th>Hora Inicio</th>
                            <th>Hora Fin</th>
                            <th>Profesor</th>
                            <th>Estado</th>
                            <th>Comentario</th>
                            <th>Valoración</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            if (asesorias != null && !asesorias.isEmpty()) {
                                for (Asesoria a : asesorias) {
                        %>
                        <tr>
                            <td><%= a.getIdAsesoria()%></td>
                            <td><%= a.getFecha()%></td>
                            <td><%= a.getHoraInicio()%></td>
                            <td><%= a.getHoraFin()%></td>
                            <td><%= a.getNombreProfesor()%></td>
                            <td><%= a.getEstado()%></td>
                            <td><%= a.getComentario() != null ? a.getComentario() : "-"%></td>
                            <td><%= a.getValoracion() != null ? a.getValoracion() : "-"%></td>
                        </tr>
                        <%
                            }
                        } else {
                        %>
                        <tr><td colspan="8" style="text-align:center; color:#999;">No tienes asesorías agendadas.</td></tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div> 
        </div>
        <footer>
            AGENDAMIENTO DE ASESORÍAS VIRTUALES
        </footer>
        <a href="logout.jsp">Cerrar sesión</a>
        <script src="./js/SeleccinarHorariosDisponibles.js"></script>
    </body>
</html>
