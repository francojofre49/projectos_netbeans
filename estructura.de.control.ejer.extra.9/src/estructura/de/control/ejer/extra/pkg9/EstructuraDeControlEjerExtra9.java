/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package estructura.de.control.ejer.extra.pkg9;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividendo;
        int divisor;
        int resto;
        int cociente=0;
        
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dividendo");
        dividendo= leer.nextInt();
        System.out.println("Ingrese divisor");
        divisor= leer.nextInt();
        resto=dividendo;
        while(resto>divisor){
        
        System.out.print(resto+"-"+divisor+"=");
        cociente++;
        resto=resto-divisor;
         System.out.println(resto);
        }
        System.out.println("El residuo es "+ resto+ " y el cociente es "+ cociente);
       //Escribir sin saltar resto " - " divisor " = "
	//	cociente=cociente+1
	//	resto=resto-divisor
	//	Escribir  resto
    }
    
}
