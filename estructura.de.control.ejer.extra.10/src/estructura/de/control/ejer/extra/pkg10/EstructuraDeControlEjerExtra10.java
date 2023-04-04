/*
 Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. El 
programa debe indicar al usuario si su respuesta es o no correcta. En caso que 
la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta 
nuevamente. Para realizar este ejercicio investigue como utilizar la 
función Math.random() de Java.

 */
package estructura.de.control.ejer.extra.pkg10;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num1=Math.floor(Math.random()*10);
       double num2=Math.floor(Math.random()*10);
       int resultado;
       
       boolean respuesta=false;
       Scanner leer = new Scanner(System.in);
       System.out.println("adivine el resultado de una multiplicación entre dos números");
       do{
        System.out.println("ingrese su respuesta");
        resultado=leer.nextInt();
        
           
        if(resultado==(num1*num2)){
            System.out.println("Adivinaste el resultado de la multiplicacion de "+num1+"*"+num2);
            respuesta=true;
        
        }
       
       }while(!respuesta);
    }
    
}
