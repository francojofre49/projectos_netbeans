/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java
 */
package estructura.de.control.ejer_2;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String frase;
        System.out.println("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in);
        frase= leer.nextLine();
        
        if (frase.equals("eureka") ){
            System.out.println("correcto");
    }else{
            System.out.println("incorrecto");
        }
}
}
