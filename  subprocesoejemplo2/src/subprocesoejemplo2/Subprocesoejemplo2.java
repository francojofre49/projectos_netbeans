/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es
múltiplo del segundo, sino informe que no lo son.

 */
package subprocesoejemplo2;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class Subprocesoejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       
       int num1;
       int num2;
       
        System.out.println("Ingrese dos numeros enteros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
       if( EsMultiplo(num1,num2)){
           System.out.println(num1+" es multiplo de "+num2);
       
       }else
       {
             System.out.println(num1+" no es multiplo de "+num2);
       }
        
    }
    public static boolean EsMultiplo(int num1, int num2){
    boolean resp;
    
    resp = num1%num2==0;
   return resp;
    }
}
