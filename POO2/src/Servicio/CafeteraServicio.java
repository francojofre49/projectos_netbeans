/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author eglys
 */
public class CafeteraServicio {
    Cafetera ca1= new Cafetera();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   
    
    public Cafetera llenarCafetera(){        
       
         ca1.setCantidadActual(ca1.getCapacidadMaxima());    
          return ca1;
    }
    
    public void servirTaza(Cafetera ca1, int taza){
  
        
        if (ca1.getCantidadActual()>=taza) {
            System.out.println("Su taza es de " + taza);
            ca1.setCantidadActual(ca1.getCantidadActual()-taza);
        }else{
            System.out.println("Su taza no se lleno, la cantidad actual es de " + ca1.getCantidadActual());
        }
        
       
    }
    
    public void vaciarCafeter(){
        
        ca1.setCantidadActual(0);
        
    }
    
    public void agregarCafe(Cafetera ca1, int cafe){
        
        System.out.println("Ingrese la cantidad de café");
        cafe=leer.nextInt();
        ca1.setCantidadActual(ca1.getCantidadActual()+cafe);
        
    }

   
    
}
