/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Eze y Tahi
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        Cadena cadena = new Cadena();

        System.out.println("Ingrese una frase");
        String frase = leer.next();
        cadena.setFrase(frase);

        cadena.setLongitud(frase.length());

        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {
        int cont = 0;
        String frase = cadena.getFrase();

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (frase.substring(i, i + 1).equalsIgnoreCase("a") || frase.substring(i, i + 1).equalsIgnoreCase("e") || frase.substring(i, i + 1).equalsIgnoreCase("i") || frase.substring(i, i + 1).equalsIgnoreCase("o") || frase.substring(i, i + 1).equalsIgnoreCase("u")) {

                cont++;
            }

        }

        System.out.println("La Frase " + frase + " tiene " + cont + " vocales");

    }

    public void mostrarCadena(Cadena cadena) {

        System.out.println("Frase " + cadena.getFrase());
        System.out.println("Lontitud " + cadena.getLongitud());

    }

    public void invertirFrase(Cadena cadena) {

        String frase = cadena.getFrase();
        String frase2 = "";

        for (int i = frase.length(); i > 0; i--) {

            frase2 = frase2.concat(frase.substring(i - 1, i));

        }
        System.out.println(frase2);
    }

    public void vecesRepetido(Cadena cadena) {

        System.out.println("ingrese la letra a buscar");
        String letra = leer.next();
        int cont = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
            if (cont == 0) {
                System.out.println("No se encontro la letra" + letra + " en la frase");

            } else if (cont == 1) {

                System.out.println("La letra " + letra + " se encontro " + cont + " ves");
            } else {
                System.out.println("La letra " + letra + " se encontro " + cont + " veces");
            }
        }

    }

    public void compararLongitud(Cadena cadena) {

        System.out.println("Ingrese una frase a comparar con la original");
        String frase2 = leer.next();

        System.out.println(" La frase original es : " + cadena.getFrase());
        System.out.println("y tiene " + cadena.getLongitud() + " caracteres");
        System.out.println(" ");
        System.out.println("la nueva frase es : " + frase2);
        System.out.println("y tiene " + frase2.length() + " caracteres");

    }

    public void unirFrases(Cadena cadena) {

        System.out.println("Ingrese una frase a unir con la original");

        String frase = leer.next();
        String fraseunida = cadena.getFrase() + " " + frase;

        System.out.println(fraseunida);
    }

    public void reemplazar(Cadena cadena) {
        String frase = cadena.getFrase();
        String frase2 = "";
        System.out.println("Ingrese un caracter para reemplazar a la letra 'A'");
        String carac = leer.next();

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (frase.substring(i, i + 1).equalsIgnoreCase("a")) {
                frase2 = frase2.concat(carac);

            } else {
                frase2 = frase2.concat(frase.substring(i, i + 1));

            }

        }
        System.out.println(frase2);
    }

    public boolean contiene(Cadena cadena) {

        System.out.println("Ingrese un caracter a Buscar");
        String carac = leer.next();
        String frase = cadena.getFrase();
        boolean siono = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (frase.substring(i, i + 1).equalsIgnoreCase(carac)) {
                siono = true;

            }

        }

        System.out.println("El caracter " + carac + " se encontro dentro de la frase??? ");

        return siono;
    }

}
