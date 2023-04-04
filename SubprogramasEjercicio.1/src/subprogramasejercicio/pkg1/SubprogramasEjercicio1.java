/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 */
package subprogramasejercicio.pkg1;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class SubprogramasEjercicio1 {

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
                        System.out.println(num1+ "+" +num2+ "="+suma(num1,num2) );
                        System.out.println(" ");
                          break;
                    case 2: 
                        System.out.println(num1+ "-" +num2+ "="+ resta(num1,num2) );
                        System.out.println(" ");
                          break;
                    case 3: 
                        System.out.println(num1+ "*" +num2+ "="+ mul(num1,num2) );
                        System.out.println(" ");
                          break;
                    case 4: 
                        System.out.println(num1+ "/" +num2+ "="+ div(num1,num2) );
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
    
       public static int suma(int a, int b)
       {
         return a+b;
       }
         public static int resta(int a, int b)
       {
         return a-b;
       }
           public static int mul(int a, int b)
       {
         return a*b;
       }
             public static int div(int a, int b)
       {
         return a/b;
       }
    
}
