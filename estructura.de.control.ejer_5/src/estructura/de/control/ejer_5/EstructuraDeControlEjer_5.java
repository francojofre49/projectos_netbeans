/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a 
continuacion solicite números al usuario hasta que la suma de los numeros
introducidos supere el limite inicial.

 */
package estructura.de.control.ejer_5;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float num;
       float limite;
       num=0;
        System.out.println("Ingrese un valor limite");
        Scanner leer = new Scanner(System.in); 
        limite= leer.nextFloat();
        
        System.out.println("ingrese valores mientras la suma sean menores que el limite");
        do
        {
        num=num + leer.nextFloat();
        
        
        }while(num<limite+1);
    }
    
}
