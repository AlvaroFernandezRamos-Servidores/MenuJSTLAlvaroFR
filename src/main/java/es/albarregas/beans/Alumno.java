/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author paco
 */
public class Alumno implements Serializable{
    private String[] alumnos = {"Pepe", "Azucena", "Juan"};

    /**
     * @return the alumnos
     */
    public String[] getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
