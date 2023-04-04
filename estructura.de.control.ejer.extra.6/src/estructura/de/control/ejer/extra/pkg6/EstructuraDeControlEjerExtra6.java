/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package estructura.de.control.ejer.extra.pkg6;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int personas;
        float promedio=0;
        float promedioBajo=0;
        int cont=0;
        float altura;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas que desea saber su promedio de estatura:");
        personas= leer.nextInt();
        
        
        
        for(int i=0; i<personas;i++)
        {
           System.out.println("Ingrese la estatura nº: "+ (i+1) );
           altura= leer.nextFloat();
            if(altura< 1.60)
            {
            promedioBajo=promedioBajo+altura;
            cont++;
            }
          promedio=promedio+altura;
        
        }
        
        System.out.println("El promedio general de estaturas es de "+promedio/personas+"mts ");
        System.out.println("El promedio por debajo de 1.60mts es de "+promedioBajo/cont+"mts ");
        
    }
    
}
