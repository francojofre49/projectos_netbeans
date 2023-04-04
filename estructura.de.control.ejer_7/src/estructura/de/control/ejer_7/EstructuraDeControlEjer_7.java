/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package estructura.de.control.ejer_7;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String cadena;
     int correctas=0;
     int incorrectas=-1;
     
     Scanner leer = new Scanner(System.in); 
     
        System.out.println("ingrese una cadena de 5 caracteres");
     do{
         cadena= leer.next();
     if( (5== cadena.length()) && (cadena.substring(0,1).equalsIgnoreCase("x")) && (cadena.substring(4,5).equalsIgnoreCase("o"))){
     correctas++;
     }else{
     incorrectas++;
     }
     
     }while(!"&&&&&".equals(cadena));
     
        System.out.println("Se ingresaron "+correctas+ " datos correctos" );
         System.out.println("Se ingresaron "+incorrectas+ " datos incorrectos" );
    }
    
}
