/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer6;

import entidad.Curso;
import servicioentidad.ServicioCurso;

/**
 *
 * @author Eze
 */
public class Guia9Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioCurso sc = new ServicioCurso();
        Curso c1= sc.crearCurso();
        sc.cargarAlumnos(c1);
        System.out.println("Metodo 1");
        sc.calcularGananciaSemanalUno(c1);
        System.out.println("metodo 2");
        double ganancia =  sc.calcularGananciaSemanalDos(c1);
        System.out.println("La ganancia semana es" +ganancia);
       
       
    }
    
}
