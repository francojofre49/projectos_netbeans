/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.

 */
package coleccionesejer02extra.Servicio;

import coleccionesejer02extra.Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class CantanteFamosoService {

    Scanner leer = new Scanner(System.in);

    public void agregarCantante(ArrayList<CantanteFamoso> lista) {

        for (int i = 0; i < 5; i++) {
            CantanteFamoso cf = new CantanteFamoso();

            System.out.println("Ingresar nombre del cantante");
            cf.setNombre(leer.next());
            System.out.println("ingresar el nombre del disco mas vendido");
            cf.setDiscoConMasVentas(leer.next());

            lista.add(cf);

        }

    }

    public void mostrar(ArrayList<CantanteFamoso> lista) {

        for (CantanteFamoso c : lista) {

            System.out.println("Nombre del Cantante: " + c.getNombre());
            System.out.println("Nombre del Disco mas Vendido: " + c.getDiscoConMasVentas());

        }

    }

    public void agregarCantante2(ArrayList<CantanteFamoso> lista) {

        CantanteFamoso cf = new CantanteFamoso();

        System.out.println("Ingresar nombre del cantante");
        cf.setNombre(leer.next());
        System.out.println("ingresar el nombre del disco mas vendido");
        cf.setDiscoConMasVentas(leer.next());

        lista.add(cf);

    }

    public void eliminarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingresar nombre del cantantante a eliminar");
        String borrar = leer.next();

        Iterator it = lista.iterator();

        int cont = 0;
        while (it.hasNext()) {

            if (it.next().toString().equalsIgnoreCase(borrar)) {
                it.remove();
                cont++;
                System.out.println("Se elimino al cantante " + borrar);
            }

        }

        if (cont == 0) {
            System.out.println("no se encontro el cantante");

        }

    }

    public void menu(ArrayList<CantanteFamoso> lista) {

    }

}
