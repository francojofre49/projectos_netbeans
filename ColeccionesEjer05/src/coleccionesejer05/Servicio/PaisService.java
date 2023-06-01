/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package coleccionesejer05.Servicio;

import coleccionesejer05.Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class PaisService {

    private HashSet<Pais> paises = new HashSet();
    Scanner leer = new Scanner(System.in);

    public void guardarPais() {
        String resp;
        do {
            Pais pais = new Pais();
            System.out.println("Ingresar un pais");
            pais.setNombre(leer.next());
            paises.add(pais);

            System.out.println("Desea seguir ingresando paises?(n/s)");
            resp = leer.next();

        } while (resp.equals("s"));
        for (Pais paise : paises) {
            System.out.println(paise.getNombre());
        }
        System.out.println("---------------------------------------------------");
    }

    public void ordenar() {

        ArrayList<Pais> paiseList = new ArrayList(paises);
        paiseList.sort(Pais.ordenarPais);
        for (Pais pais : paiseList) {
            System.out.println(pais.getNombre());
        }

    }

    public void eliminarPais() {
        System.out.println("Ingrese el nombre del pais a eliminar de lista");
        String borrar = leer.next();

        Iterator it = paises.iterator();
boolean encontrado=false;
        while (it.hasNext()) {
            if (it.next().toString().equals(borrar)){
                    it.remove();
                    encontrado=true;
            }

        }
        System.out.println("--------------------------------------------------");
        for (Pais paise : paises) {
            System.out.println(paise.getNombre());
        }
if (!encontrado){
    System.out.println("No se encontro el pais dentro del conjunto");

}
    }

}
