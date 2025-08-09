<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Agendamiento de Asesorías Virtuales</title>
    <link rel="stylesheet" href="./css/styles.css">
    <style>
        .radio-group {
            display: flex;
            gap: 20px;
            align-items: center;
        }
        .radio-group label {
            display: flex;
            align-items: center;
            gap: 5px;
        }
        .error {
            color: red;
            font-size: 14px;
        }
    </style>
</head>
<body>
<header>
    <h1>Sistema de Asesorías</h1>
</header>

<div class="container">
    <div class="form-box">
        <h2>Ingresa a tu cuenta</h2>
        <p>¿Aún no tienes tu cuenta?</p>
        <a href="CrearCuenta.html">Regístrate</a>

        <!-- Mostrar error si existe -->
            <% if (request.getAttribute("error") != null) { %>
                <p class="error"><%= request.getAttribute("error") %></p>
            <% } %>


            <form action="login" method="POST">
            <label for="correo">Correo electrónico</label>
            <input type="email" id="correo" name="correo" placeholder="Ingrese su correo" required>

            <label for="contrasena">Contraseña</label>
            <input type="password" id="contrasena" name="contrasena" placeholder="Ingrese su contraseña" required>


            <br>
            <button type="submit">Iniciar sesión</button>
        </form>
    </div>
</div>

<footer>
    AGENDAMIENTO DE ASESORÍAS VIRTUALES
</footer>
</body>
</html>
