/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package subprogramaejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Subprogramaejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        if (EsPrimo(num)) {
            System.out.println("es primo");

        } else {
            System.out.println("no es primo");
        }

    }
   
    public static boolean EsPrimo(int num) {

        int cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        return cont == 2;

    }
}
