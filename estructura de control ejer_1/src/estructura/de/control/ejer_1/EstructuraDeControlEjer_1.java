/*
 Crear un programa que dado un número determine si es par o impar.
 */
package estructura.de.control.ejer_1;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        num= leer.nextInt();  
        
        if(num%2 == 0){
            System.out.println(num+" es un numero par");
            
        }
        else{
             
            System.out.println(num+" es un numero impar");
                }
    }
    
}
