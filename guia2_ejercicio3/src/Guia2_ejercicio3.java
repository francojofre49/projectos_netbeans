
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frank
 */
public class Guia2_ejercicio3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){            
      
        System.out.println("Ingrese frase");
        Scanner sc = new Scanner(System.in);
        String  frase = sc.next();
        frase = frase.toLowerCase();
        System.out.println("la frase en minuscula es " + frase);   
        frase = frase.toUpperCase();
        System.out.println("la frase en minuscula es " + frase);   
    
}
}
        