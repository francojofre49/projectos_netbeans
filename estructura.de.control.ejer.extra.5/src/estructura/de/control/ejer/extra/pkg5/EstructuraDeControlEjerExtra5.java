/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.

 */
package estructura.de.control.ejer.extra.pkg5;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String socio;
      float costo;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese que tipo de socio es:(A,B,C)");
      socio= leer.next();
     
      switch(socio){
          case "A":
                    System.out.println("Ingrese costo del tratamiento");
                    costo=leer.nextFloat();
                    System.out.println("EL valor de su tratamiento con el descuento del 50% es de: $"+ costo*0.5);
                    break;
                    
                    
          case "B":
                    System.out.println("Ingrese costo del tratamiento");
                    costo=leer.nextFloat();
                    System.out.println("EL valor de su tratamiento con el descuento del 35% es de: $"+ costo*0.35);
                     break;
                    
          case "C":
                    System.out.println("Ingrese costo del tratamiento");
                    costo=leer.nextFloat();
                    System.out.println("EL valor de su tratamiento es el mismo por quesos un rata y pagas la clase C: $"+ costo);
                     break;
                    
          default: System.out.println("no ingreso una clase valida");
                              
                     }
      
    }
    
}
