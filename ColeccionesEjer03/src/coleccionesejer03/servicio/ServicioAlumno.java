/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package coleccionesejer03.servicio;

import coleccionesejer03.entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);

    public void crearAlumnos(ArrayList<Alumno> listaAlumnos) {

        String resp;

        do {
            ArrayList<Integer> aux = new ArrayList();
            Alumno a = new Alumno();
            System.out.println("Ingresar nombre del Alumno");
            a.setNombre(leer.next());
            System.out.println("Ingresar 3 notas");
            aux.add(leer.nextInt());
            aux.add(leer.nextInt());
            aux.add(leer.nextInt());
            a.setNotas(aux);

            listaAlumnos.add(a);

            System.out.println("Desea seguir cargando alumnos?(s/n)");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("s"));

        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.toString());
        }

    }

    public void notaFinal(ArrayList<Alumno> listaAlumnos) {

        System.out.println("Ingrese un nombre de un alumno a buscar");
        String busqueda = leer.next();
        Integer promedio = 0;
        int cont=0;

        for (Alumno listaAlumno : listaAlumnos) {

            if (busqueda.equalsIgnoreCase(listaAlumno.getNombre())) {
                ArrayList<Integer> aux2 = listaAlumno.getNotas();
                for (Integer integer : aux2) {
                    promedio += integer;
cont++;
                }
                System.out.println("El promedio del alumno "+ busqueda +" es de:" + (promedio/3));

            }
        }
        if(cont==0){
            System.out.println("no se encontro el alumno");
        
        
        }

    }

}
