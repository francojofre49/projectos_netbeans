/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package estructura.de.control.ejer_6;
import java.util.Scanner;
/**
 *
 * @author frank
 */

public class EstructuraDeControlEjer_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int menu;
        String salir;
        salir="N";
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese dos numeros enteros");
         num1= leer.nextInt();
         num2= leer.nextInt();
         
         do{
            do{
                
                System.out.println("------------MENU-----------");
                System.out.println("1-SUMA");
                System.out.println("2-RESTA");
                System.out.println("3.MULTIPLICAR");
                System.out.println("4.DIVIDIR");
                System.out.println("5.SALIR");
                 System.out.println("ELIJA UNA OPCION:");
                menu= leer.nextInt();
         
                switch(menu){
         
                    case 1: 
                        System.out.println(num1+ "+" +num2+ "="+ (num1+num2) );
                        System.out.println(" ");
                          break;
                    case 2: 
                        System.out.println(num1+ "-" +num2+ "="+ (num1-num2) );
                        System.out.println(" ");
                          break;
                    case 3: 
                        System.out.println(num1+ "*" +num2+ "="+ (num1*num2) );
                        System.out.println(" ");
                          break;
                    case 4: 
                        System.out.println(num1+ "/" +num2+ "="+ (num1/num2) );
                        System.out.println(" ");
                          break;      
                    case 5: 
                        System.out.println("Desea salir del programa? S/N");
                        salir= leer.next();
                        break; 
                           }      
         
                }while(menu<5);
         
         }while(salir.equalsIgnoreCase("n"));
        
        
        
        
        
        
        
    }
    
}
