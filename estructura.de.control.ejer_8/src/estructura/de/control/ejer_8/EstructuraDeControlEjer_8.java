/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por 
ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*      *
* * * *

 */

package estructura.de.control.ejer_8;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class EstructuraDeControlEjer_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lados;
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese n elemetos por lados: ");
        lados= leer.nextInt();
        
        for(int i=0; i<lados; i++){
            for(int j=0; j<lados; j++){
                
                if(i==0 || i==lados-1 || j==0 || j==lados-1 ){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            
            }
        
            System.out.println("");
        }
        
        
        
    }
    
}
