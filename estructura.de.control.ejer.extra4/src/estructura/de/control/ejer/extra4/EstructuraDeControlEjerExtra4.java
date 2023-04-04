/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre
su equivalente en romano.

 */
package estructura.de.control.ejer.extra4;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero entre el 1 y 10 a convertir en romano");
       do{
            num=leer.nextInt();
        
            if(num<1 || num>10)
                {
                    System.out.println("INGRESE UN NUMERO VALIDO!!!(entre 1 y 10)");
                }
         
         }while(num<1 || num>10) ;  
       
       switch(num){
       
           case 1: System.out.println("I");
           break;
           case 2: System.out.println("II");
           break;
           case 3: System.out.println("III");
           break;
           case 4: System.out.println("IV");
           break;
           case 5: System.out.println("V");
           break;
           case 6: System.out.println("VI");
           break;
           case 7: System.out.println("VII");
           break;
           case 8: System.out.println("VIII");
           break;
           case 9: System.out.println("IX");
           break;
           case 10: System.out.println("X");
           break;
                }
       
       
    }
    
}
