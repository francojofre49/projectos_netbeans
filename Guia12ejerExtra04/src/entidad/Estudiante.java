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
public final class Estudiante extends Persona {
    
//    En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
    
    protected String curso;
    Scanner leer = new Scanner(System.in);
    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, int numId, String EstadoCivil) {
        super(nombre, apellido, numId, EstadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        return "Estudiante{"  +"nombre=" + nombre + "\n apellido=" + apellido + "\n numId=" + numId + "\n EstadoCivil=" + EstadoCivil + "\ncurso=" + curso + '}'+"-----------------------------------------------------------";
    }

    

    @Override
    public void cambiarEstadoCivil() {
        System.out.println("----------------------Cambio de Estado Civil de----------------------");
        
        System.out.println("Ingresar nuevo estado civil");
        EstadoCivil=leer.next();
    }
    public void crearEstudiante(){
      
        
        System.out.println("----------------------Ingresar Estudiante----------------------");
        System.out.println(" ");
        System.out.println("Ingresar Nombre");
        nombre=leer.next();
        System.out.println("Ingresar Apellido");
        apellido=leer.next();
        System.out.println("Ingresar numero de ID");
        numId=leer.nextInt();
        System.out.println("Ingresar estado civil");
        EstadoCivil=leer.next();
        System.out.println("Ingresar Curso a matricular");
        curso=leer.next();
    
    }
    
    
    public void matricular(){
    
        System.out.println("----------------------Matricular Estudiante----------------------");
        System.out.println("Ingresar nuevo curso a matricular");
        curso=leer.next();
    }
    
}
