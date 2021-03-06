package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vinculo generated by hbm2java
 */
public class Vinculo  implements java.io.Serializable {


     private int id;
     private String denominacion;
     private byte estado;
     private String descripcion;
     private String observacion;
     private Set apoderados = new HashSet(0);

    public Vinculo() {
    }

	
    public Vinculo(int id, String denominacion, byte estado) {
        this.id = id;
        this.denominacion = denominacion;
        this.estado = estado;
    }
    public Vinculo(int id, String denominacion, byte estado, String descripcion, String observacion, Set apoderados) {
       this.id = id;
       this.denominacion = denominacion;
       this.estado = estado;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.apoderados = apoderados;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(byte estado) {
        this.estado = estado;
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
    public Set getApoderados() {
        return this.apoderados;
    }
    
    public void setApoderados(Set apoderados) {
        this.apoderados = apoderados;
    }




}


