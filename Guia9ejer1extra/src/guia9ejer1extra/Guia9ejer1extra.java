/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package guia9ejer1extra;

import guia9ejer1extra.Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Guia9ejer1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean acerto = false;
        Meses m = new Meses();
        String mes;
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
        do {

            mes = leer.next();

            if (m.getMesSecreto().equalsIgnoreCase(mes)) {
                System.out.println("¡Ha acertado!");
                acerto = true;
            } else {

                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }

        } while (!acerto);

    }

}
