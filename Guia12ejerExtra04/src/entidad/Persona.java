/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author frank
 */
public abstract class Persona {
    
//    Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
    
    protected String nombre;
    protected String apellido;
    protected int numId;
    protected String EstadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int numId, String EstadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numId = numId;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numId=" + numId + ", EstadoCivil=" + EstadoCivil + '}';
    }
    
    public abstract void cambiarEstadoCivil(); 
  
}
