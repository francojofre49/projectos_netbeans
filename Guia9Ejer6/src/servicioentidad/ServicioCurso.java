/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioentidad;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Eze
 */
public class ServicioCurso {
    
    private Scanner leer = new Scanner(System.in);
    
    
    public void cargarAlumnos(Curso curso){
        
        String[] auxiliogato = new String[5];
        
        System.out.println("*******Cargar alumnnos*************");
        
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            
            System.out.println("Ingrese el nombre del alumno bebecito:");
            
            
            auxiliogato[i] = leer.next();
           
            
           
        }
        
        curso.setAlumnos(auxiliogato);
        
        
    }
    
    
    public Curso crearCurso(){
        
        Curso curso = new Curso();
        
        System.out.println("*******CARGAR CURSO***********");
        
        System.out.println("Ingrese el nombre del curso");
        curso.setNombrecurso(leer.next());
        System.out.println("Ingrese la cantidad de horas x dias");
        curso.setHspordia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana del curso:");
        curso.setDiasporsemana(leer.nextInt());
        System.out.println("Ingrese el turno");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por Hora de su curso capo");
        curso.setPrecioporhora(leer.nextDouble());
        
        return curso;
    }
    
    
    
    public void calcularGananciaSemanalUno(Curso curso){
        
       double ganancia = curso.getHspordia()*curso.getDiasporsemana()*curso.getPrecioporhora()*5;
       
        System.out.println("La ganancia del Curso " +curso.getNombrecurso() + " semanal es de: " +ganancia);
        
    }
    
    public double calcularGananciaSemanalDos(Curso curso){
        
       
        
        return curso.getHspordia()*curso.getDiasporsemana()*curso.getPrecioporhora()*5;
    }
    
}




//este método se encarga de calcular la ganancia en una semana por curso. 
//Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, 
//la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
