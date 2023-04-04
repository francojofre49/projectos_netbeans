/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_ejercicios5;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Guia2_Ejercicios5 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingresar un numero entero");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
       
       
     
                
     System.out.println("el doble de " +num+" es:" +num*2);  
     System.out.println("el triple de "+num+" es:" +num*3);  
     System.out.println("el raiz cuadrada de "+num+" es: " + Math.sqrt(num));  
        
    }
  
}