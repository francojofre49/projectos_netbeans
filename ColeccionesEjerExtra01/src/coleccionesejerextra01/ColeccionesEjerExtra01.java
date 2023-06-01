/*
 1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).

 */
package coleccionesejerextra01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ColeccionesEjerExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        
        
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        System.out.println("ingresar numero(-99 para cortar)");
        
        while (numero != -99) {

            numero = leer.nextInt();
            if (numero == -99) {
                System.out.println("ya fue ");

            } else {

                numeros.add(numero);

            }

        }
        
         int suma=0;
        for (Integer numero1 : numeros) {
            suma+=numero1;
        }
        
        System.out.println("Se ingresaron : "+ numeros.size()+" valores,  la suma de sus valores es: "+ suma +" y su media:  "+ (float)suma/numeros.size());
       
        

    }

}
