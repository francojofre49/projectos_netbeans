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
public class PersonalDeServicio extends Empleado {
//    Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
    protected String seccion;
    Scanner leer = new Scanner(System.in);
    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anio, int numDespacho, String nombre, String apellido, int numId, String EstadoCivil) {
        super(anio, numDespacho, nombre, apellido, numId, EstadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
        return "PersonalDeServicio{"  +"nombre=" + nombre + "\n apellido=" + apellido + "\n numId=" + numId + "\n EstadoCivil=" + EstadoCivil + "\nseccion=" + seccion + '}'+"-----------------------------------------------------------";
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
    
    
    
    public void crearPersonal(){
        
          System.out.println("----------------------Ingresar Personal de Servicio----------------------");
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
        System.out.println("Ingresar seccion en la que trabaja");
        seccion=leer.next();
    
    }
    
    public void TrasladoSeccion(){
      System.out.println("----------------------Traslado de Seccion----------------------");
        System.out.println("Ingresar nueva seccion del empleado");
           seccion=leer.next();
    
    
    }
}
