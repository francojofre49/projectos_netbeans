/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a 
buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package arreglo.ejer.pkg02;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ArregloEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] vector;
        
        System.out.println("Ingrese tamaño de vector");
        vector=new int[leer.nextInt()];
        
        for (int i = 0; i < vector.length ; i++) {
            
            vector[i]=(int) (Math.random() * 10);

        }
        System.out.println("Ingrese el numero a buscar dentro del vector(0/9)");
        int n=leer.nextInt();
        int cont=0;
        for (int i = 0; i< vector.length; i++) {
            
            if(vector[i]==n){
                System.out.println("["+i+"]");
            cont++;
            }
        }
        System.out.println("se encontro "+cont+" veces");
        
        
    }
    
}
