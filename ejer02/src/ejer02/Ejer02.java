/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer02;

import Entidad.Circunferencia;

/**
 *
 * @author frank
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        Circunferencia c=new Circunferencia();
        
        c.crearCircunferencia();
        
        System.out.println("Area= "+c.area());
        System.out.println("Perimetro= "+c.perimetro());
        
    }
    
}
