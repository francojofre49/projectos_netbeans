/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 
día, 2 horas.

 */
package estructura.de.control.ejer.extra.pkg1;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minutos;
        
        System.out.println("Ingrese la cantidad de minutos que desea convertir en dias y horas");
        Scanner leer = new Scanner(System.in); 
        minutos= leer.nextInt();
        
        
        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;//se le hace mod 24 a las horas para sacar el resto de las horas que no son dias
        
        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
    }
    
}
