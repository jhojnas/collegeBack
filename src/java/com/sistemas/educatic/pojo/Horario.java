package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Horario generated by hbm2java
 */
public class Horario  implements java.io.Serializable {


     private int id;
     private Docente docente;
     private Date horaInicio;
     private Date horaFin;
     private Set gradoCursos = new HashSet(0);

    public Horario() {
    }

	
    public Horario(int id, Docente docente) {
        this.id = id;
        this.docente = docente;
    }
    public Horario(int id, Docente docente, Date horaInicio, Date horaFin, Set gradoCursos) {
       this.id = id;
       this.docente = docente;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.gradoCursos = gradoCursos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public Set getGradoCursos() {
        return this.gradoCursos;
    }
    
    public void setGradoCursos(Set gradoCursos) {
        this.gradoCursos = gradoCursos;
    }




}


