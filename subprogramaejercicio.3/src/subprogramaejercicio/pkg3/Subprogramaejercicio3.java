/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como
parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá
ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package subprogramaejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Subprogramaejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long plata;
        String cambio;

        System.out.println("ingrese cantidad de euros que quiere calcular: ");
        plata = leer.nextLong();
        System.out.println("Ingrese que tipo de cambio:(dolar/yen/libra) ");
        cambio = leer.next();

        cambioDeMoneda(plata, cambio);

    }

    public static void cambioDeMoneda(long plata, String cambio) {

        switch (cambio) {
            case "dolar":
                System.out.println(plata + "€ son " + (plata * 1.28611) + "$");
                break;
            case "yen":
                System.out.println(plata + "€ son " + (plata * 129.852) + "yenes");

                break;
            case "libra":
                System.out.println(plata + "€ son " + (plata * 0.86) + "libras");
                break;

        }

    }
}
