/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.RevolverDeAgua;
import java.util.Scanner;

/**
 *
 * @author Eze
 */
public class ServicioRevolver {
    
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public void llenarRevolver(RevolverDeAgua revolver){
        
        revolver.setPosicionActual((int)Math.floor(Math.random() * 6) + 1);
        
        revolver.setPosicionAgua((int)Math.floor(Math.random() * 6) + 1);
      

    }
    
    public boolean mojar(RevolverDeAgua revolver){
        
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }
    
    public void siguienteChorro(RevolverDeAgua revolver){
        
        int actual = revolver.getPosicionActual();
        int siguiente = 1;
        
        
        
        if (actual + siguiente <= 6) {
            
            revolver.setPosicionActual(actual+siguiente);
            
        } else{
            revolver.setPosicionActual(1);
        }
        
        
    }
    
    public void mostrarRevolver(RevolverDeAgua revolver){
        
        System.out.println("****REVOLVER DE AGUA******");
        System.out.println("Posicion Agua: " +revolver.getPosicionAgua());
        System.out.println(" ");
        System.out.println("Posicion Actual del TAMBOR : " +revolver.getPosicionActual());
        System.out.println("***********");
    }
    
}
