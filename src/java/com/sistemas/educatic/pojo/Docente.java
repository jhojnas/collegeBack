package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Docente generated by hbm2java
 */
public class Docente  implements java.io.Serializable {


     private int id;
     private Institucion institucion;
     private Persona persona;
     private String codigo;
     private byte estado;
     private String observacion;
     private String especilidad;
     private Set docenteGrados = new HashSet(0);
     private Set horarios = new HashSet(0);

    public Docente() {
    }

	
    public Docente(int id, Institucion institucion, Persona persona, String codigo, byte estado) {
        this.id = id;
        this.institucion = institucion;
        this.persona = persona;
        this.codigo = codigo;
        this.estado = estado;
    }
    public Docente(int id, Institucion institucion, Persona persona, String codigo, byte estado, String observacion, String especilidad, Set docenteGrados, Set horarios) {
       this.id = id;
       this.institucion = institucion;
       this.persona = persona;
       this.codigo = codigo;
       this.estado = estado;
       this.observacion = observacion;
       this.especilidad = especilidad;
       this.docenteGrados = docenteGrados;
       this.horarios = horarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Institucion getInstitucion() {
        return this.institucion;
    }
    
    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public String getEspecilidad() {
        return this.especilidad;
    }
    
    public void setEspecilidad(String especilidad) {
        this.especilidad = especilidad;
    }
    public Set getDocenteGrados() {
        return this.docenteGrados;
    }
    
    public void setDocenteGrados(Set docenteGrados) {
        this.docenteGrados = docenteGrados;
    }
    public Set getHorarios() {
        return this.horarios;
    }
    
    public void setHorarios(Set horarios) {
        this.horarios = horarios;
    }




}


