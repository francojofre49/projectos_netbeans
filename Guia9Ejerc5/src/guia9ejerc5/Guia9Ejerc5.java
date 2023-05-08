/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejerc5;

import guia9ejerc5.Entidad.Persona;
import guia9ejerc5.PersonaService.PersonaService;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Guia9Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        PersonaService ps1= new PersonaService();
        Persona p1=ps1.crearPersona();
        
        System.out.println("La edad de la persona es " +  ps1.calcularEdad(p1));
        
        System.out.println("Ingrese una edad a consultar");
        int edad= leer.nextInt();
       
        if(ps1.menorQue(p1, edad)){
            System.out.println("La edad consultada es mayor a la edad de la persona");
        }else{
         System.out.println("La edad consultada es menor a la edad de la persona");
        }
        ps1.mostrarPersona(p1);
        
        
        
    }
    
}
