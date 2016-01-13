package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private int id;
     private Persona persona;
     private Date fechaIngresa;
     private String descripcion;
     private String observacion;
     private Byte estado;
     private Set matriculas = new HashSet(0);

    public Estudiante() {
    }

	
    public Estudiante(int id, Persona persona) {
        this.id = id;
        this.persona = persona;
    }
    public Estudiante(int id, Persona persona, Date fechaIngresa, String descripcion, String observacion, Byte estado, Set matriculas) {
       this.id = id;
       this.persona = persona;
       this.fechaIngresa = fechaIngresa;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.estado = estado;
       this.matriculas = matriculas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Date getFechaIngresa() {
        return this.fechaIngresa;
    }
    
    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(Byte estado) {
        this.estado = estado;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }




}


