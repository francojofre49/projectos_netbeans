/*
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package arreglo.ejer.pkg03;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ArregloEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         int []  vector;
        
        System.out.println("Ingrese tamaño de vector");
        vector=new int[leer.nextInt()];
        
        
        for (int i = 0; i < vector.length ; i++) {
            
            vector[i]=(int) (Math.random() * 20000);

        }
        int cont=0;
     int trunc;
        for (int i = 0; i < vector.length; i++) {
            cont=0;
            System.out.print(vector[i]);
              trunc=vector[i];
            do {
               
               
                trunc=trunc/10;
                 cont++;
            } while (trunc>0);
            System.out.println( "  tiene "+cont+" digitos");
        }
        
        
    }
    
}
