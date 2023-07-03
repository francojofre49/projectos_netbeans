/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public final class Profesores extends Empleado {
//    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
    
    protected String  departamento;
    Scanner leer = new Scanner(System.in);
    public Profesores() {
    }

    public Profesores(String departamento, int anio, int numDespacho, String nombre, String apellido, int numId, String EstadoCivil) {
        super(anio, numDespacho, nombre, apellido, numId, EstadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

        return "Profesores{"  +"nombre=" + nombre + "\n apellido=" + apellido + " \n numId=" + numId + "\n EstadoCivil=" + EstadoCivil  + "\n departamento=" + departamento + '}'+"-----------------------------------------------------------";
    }

    @Override
    public void reasignarDespacho() {
         System.out.println("---------------------Reasignar Despacho----------------------");
         System.out.println("Ingresar numero del nuevo Despacho");
           numDespacho=leer.nextInt();
         
    }

    @Override
    public void cambiarEstadoCivil() {
       System.out.println("----------------------Cambio de Estado Civil----------------------");
        
        System.out.println("Ingresar nuevo estado civil");
        EstadoCivil=leer.next();
    }
    
    
    
    
    public void crearProfesor(){
    System.out.println("----------------------Ingresar Profesor----------------------");
        System.out.println(" ");
        System.out.println("Ingresar Nombre");
        nombre=leer.next();
        System.out.println("Ingresar Apellido");
        apellido=leer.next();
        System.out.println("Ingresar numero de ID");
        numId=leer.nextInt();
        System.out.println("Ingresar estado civil");
        EstadoCivil=leer.next();
        System.out.println("Ingresar año de ingreso a la facultad");
        anio=leer.nextInt();
        System.out.println("Ingresar numero de despacho asignado");
        numDespacho=leer.nextInt();
        System.out.println("Ingresar nombre del Departemento al que pertenece");
        departamento=leer.next();
        
    }
    
    public void cambioDepartamento(){
     System.out.println("----------------------Cambiar Departamento Profesor----------------------");
        System.out.println("ingresar nuevo Departamento del profesor");
         departamento=leer.next();
    
    
    
    }
    
}
