/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package estructura.de.control.ejer.extra.pkg7;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjerExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       int cont=1;
       float n2;
       float max;
       float min;
       float promedio=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese cantidad de numeros a ingresar:");
        n=leer.nextInt();
        System.out.println("Ingresar numeros");
        n2=leer.nextFloat();
        max=n2;
        min=n2;
        while(n>cont)
            {
              
                if(n2<min){
                min=n2;
                }else if(n2>max){
                max=n2;
                }  
                
                n2=leer.nextFloat();
                promedio=promedio+n2;
                cont++;
            }
        
        System.out.println("El promedio es "+(promedio/n)+", el valor maximo es "+max+ " y el minimo es "+min);
    }
    
}
