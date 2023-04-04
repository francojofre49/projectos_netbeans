/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Guia2_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese dos numeros enteros");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();      
        
        int suma = num1+num2;

        System.out.println("La suma de ambos numeros es:--> " + suma);        
    }
    }
    

