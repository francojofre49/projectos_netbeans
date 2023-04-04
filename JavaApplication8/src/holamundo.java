/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        
        System.out.println("ingrese tu nombre:");
        
        nombre = leer.next();
        
        System.out.println("hola mundo! soy " + nombre + " y estoy programando en Java");
    }
    
}