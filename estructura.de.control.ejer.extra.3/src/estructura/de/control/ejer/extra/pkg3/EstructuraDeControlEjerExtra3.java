/*
 laborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.

 */
package estructura.de.control.ejer.extra.pkg3;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String letra;
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese una letra");
        letra= leer.next();
        
        if(letra.equals("a") ||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u"))
        
        {
            System.out.println(letra+" es una vocal");
        } else {
            System.out.println(letra+" no es una vocal");
        }
        
        
    
}
}