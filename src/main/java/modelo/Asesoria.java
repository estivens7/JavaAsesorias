package modelo;

import java.sql.Date;
import java.sql.Time;

public class Asesoria {
    private int idAsesoria;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private String nombreProfesor;
    private String estado;
    private String comentario;
    private Integer valoracion;

    // Getters y setters
    public int getIdAsesoria() { return idAsesoria; }
    public void setIdAsesoria(int idAsesoria) { this.idAsesoria = idAsesoria; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Time getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Time horaInicio) { this.horaInicio = horaInicio; }

    public Time getHoraFin() { return horaFin; }
    public void setHoraFin(Time horaFin) { this.horaFin = horaFin; }

    public String getNombreProfesor() { return nombreProfesor; }
    public void setNombreProfesor(String nombreProfesor) { this.nombreProfesor = nombreProfesor; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public Integer getValoracion() { return valoracion; }
    public void setValoracion(Integer valoracion) { this.valoracion = valoracion; }
}
