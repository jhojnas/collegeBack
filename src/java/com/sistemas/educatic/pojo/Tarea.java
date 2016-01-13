package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tarea generated by hbm2java
 */
public class Tarea  implements java.io.Serializable {


     private int id;
     private GradoCurso gradoCurso;
     private String titulo;
     private String descripcion;
     private Date fechaInicio;
     private Date fechaEntrega;
     private Byte calificacion;
     private int idUsuario;

    public Tarea() {
    }

	
    public Tarea(int id, GradoCurso gradoCurso, String titulo, String descripcion, int idUsuario) {
        this.id = id;
        this.gradoCurso = gradoCurso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
    }
    public Tarea(int id, GradoCurso gradoCurso, String titulo, String descripcion, Date fechaInicio, Date fechaEntrega, Byte calificacion, int idUsuario) {
       this.id = id;
       this.gradoCurso = gradoCurso;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.fechaInicio = fechaInicio;
       this.fechaEntrega = fechaEntrega;
       this.calificacion = calificacion;
       this.idUsuario = idUsuario;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public GradoCurso getGradoCurso() {
        return this.gradoCurso;
    }
    
    public void setGradoCurso(GradoCurso gradoCurso) {
        this.gradoCurso = gradoCurso;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }
    
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Byte getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(Byte calificacion) {
        this.calificacion = calificacion;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}


