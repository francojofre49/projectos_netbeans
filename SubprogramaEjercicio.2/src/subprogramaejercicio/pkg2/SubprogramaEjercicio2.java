/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package subprogramaejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class SubprogramaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        String nombre = "";
        int edad = 0;
        String resp;

        System.out.println("Ingrese cantidad de personas: ");
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(mayorDeEdad(nombre, edad, leer, i));
            System.out.println("Desea seguir ingresando personas ?");
            resp = leer.next();
            if (resp.equalsIgnoreCase("No")) {
                break;
            }

        }
    }

    public static String mayorDeEdad(String nombre, int edad, Scanner leer, int i) {
        String retorno;

        System.out.println("Ingrese el nombre y edad de la persona nº:" + (i + 1));
        nombre = leer.next();
        edad = leer.nextInt();
        if (edad >= 18) {
            retorno = "es mayor de edad";

        } else {
            retorno = "es menor de edad";
        }
        return retorno;
    }

}
