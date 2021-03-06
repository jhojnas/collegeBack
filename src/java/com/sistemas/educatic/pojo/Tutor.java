package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tutor generated by hbm2java
 */
public class Tutor  implements java.io.Serializable {


     private int id;
     private Persona persona;
     private Integer grado;
     private Set grados = new HashSet(0);

    public Tutor() {
    }

	
    public Tutor(int id, Persona persona) {
        this.id = id;
        this.persona = persona;
    }
    public Tutor(int id, Persona persona, Integer grado, Set grados) {
       this.id = id;
       this.persona = persona;
       this.grado = grado;
       this.grados = grados;
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
    public Integer getGrado() {
        return this.grado;
    }
    
    public void setGrado(Integer grado) {
        this.grado = grado;
    }
    public Set getGrados() {
        return this.grados;
    }
    
    public void setGrados(Set grados) {
        this.grados = grados;
    }




}


