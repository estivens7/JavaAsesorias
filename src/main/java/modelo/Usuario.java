package modelo;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String correo_electronico;
    private String contrasena;
    private String rol;
    private String foto_perfil;

    // Getters y setters
    public int getId_usuario() { return id_usuario; }
    public void setId_usuario(int id_usuario) { this.id_usuario = id_usuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo_electronico() { return correo_electronico; }
    public void setCorreo_electronico(String correo_electronico) { this.correo_electronico = correo_electronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getFoto_perfil() { return foto_perfil; }
    public void setFoto_perfil(String foto_perfil) { this.foto_perfil = foto_perfil; }
}
