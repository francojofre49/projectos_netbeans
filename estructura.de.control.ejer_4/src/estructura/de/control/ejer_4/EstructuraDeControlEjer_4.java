/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 */
package estructura.de.control.ejer_4;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String frase;
  String primero;
  System.out.println("ingrese una frase");
  Scanner leer = new Scanner(System.in); 
  frase = leer.nextLine();
  primero=frase.substring(0,1);
  if (primero.equals("A")   ){
      System.out.println("CORRECTO");
  }else{
      System.out.println("INCORRECTO");
  }
  
    }
    
}
