package ejer_01;


import java.util.Scanner;

public class Guia2_Ejercicio1 {
    public static void main(String[] args){            
      
        System.out.println("Ingrese los numero:-->");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();      
        
        int suma = num1+num2;

        System.out.println("La suma de ambos numeros es:--> " + suma);        
    }
}