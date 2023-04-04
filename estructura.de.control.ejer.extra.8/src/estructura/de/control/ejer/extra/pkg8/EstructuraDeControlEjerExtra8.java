/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.

 */
package estructura.de.control.ejer.extra.pkg8;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num=0;
       int cant=0;
       int par=0;
       int impar=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numeros enteros");
               
       
       do{
       num=leer.nextInt();
       cant++;
       if(num%2==0){
       par++;
       
       }else{
       impar++;
       }
       if (num % 5 == 0) {
                break;
            }
       }while(true); 
     System.out.println("Se ingresaron "+cant+" numeros, "+par+" fuerom pares y "+impar+" impar");      
    }
    
}
