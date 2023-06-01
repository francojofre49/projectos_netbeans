/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package coleccionesejer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ColeccionesEjer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);

        String resp;
        do {
            System.out.println("Ingresar una raza de perro");
            String perro = leer.next();
            razas.add(perro);

            System.out.println("Desea seguir ingresando razas de perros?(s/n)");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("s"));

        for (String raza : razas) {
            System.out.print(raza+" ");
        }

        Iterator it = razas.iterator();

        System.out.println("Ingresar una raza de perro para borrar ");
        String borrar = leer.next();
        int cont = 0;
        while (it.hasNext()) {

            if (it.next().equals(borrar)) {
                it.remove();
                cont++;
            }

        }
        
        if (cont==0){
            System.out.println("no se encontro la raza");
        
        }
        
       Collections.sort(razas);
         for (String raza : razas) {
            System.out.print(raza+" ");
        }
        

    }

}
