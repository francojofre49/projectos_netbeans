/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Guia2_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingresar grados centigrados");
        Scanner sc = new Scanner(System.in);
        float c= sc.nextFloat();
        float f=  32+(9*c/5)   ;    
        System.out.println("Los grados celcius convertidos en fareheint son:" +f);   
        
    }
    
}
