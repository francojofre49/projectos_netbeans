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
public abstract class Empleado extends Persona {
    
//    Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
    
    protected int anio;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anio, int numDespacho, String nombre, String apellido, int numId, String EstadoCivil) {
        super(nombre, apellido, numId, EstadoCivil);
        this.anio = anio;
        this.numDespacho = numDespacho;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
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
        return "Empleado{" + "anio=" + anio + ", numDespacho=" + numDespacho + '}';
    }
    
    public abstract void reasignarDespacho();
    
    
    
    
    
    
}
