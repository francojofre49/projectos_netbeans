/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author eglys
 */
public class ServicioPersona {
    
    Scanner leer= new Scanner(System.in);//.useDelimiter("/n");
    
    
    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos
      para llenar el objeto Persona. 
      Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje*/
    
    public Persona crearPersona(){
        Persona p1= new Persona();
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        
        do {            
             System.out.println("Ingrese su sexo, H/M/O");
             p1.setSexo(leer.next());
             if (!(p1.getSexo().equalsIgnoreCase("h")||p1.getSexo().equalsIgnoreCase("m")||p1.getSexo().equalsIgnoreCase("o"))) {
                 System.out.println("Es incorrecto");
            }
            
        } while (!(p1.getSexo().equalsIgnoreCase("h")||p1.getSexo().equalsIgnoreCase("m")||p1.getSexo().equalsIgnoreCase("o")));
        
        System.out.println("Ingrese su peso");
        p1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese su altura");
        p1.setAltura(leer.nextDouble());
        
        
        System.out.println("---------------------------------------");
       
        return p1;
    }
    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.*/
    public boolean esMayorDeEdad(Persona p1){
        
        return p1.getEdad()>=18;
    }

    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1 */
    
    public int calcularIMC(Persona p1){
        double resul= p1.getPeso()/Math.pow(p1.getAltura(), 2);
        
        if (resul<20) {
            return -1;
        }else if( resul>=20 && resul<=25){
            return 0;
        }else{
         return 1;
        }
        
    }
    
}
