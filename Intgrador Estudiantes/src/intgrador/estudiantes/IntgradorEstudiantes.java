/*
 Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package intgrador.estudiantes;

import intgrador.estudiantes.Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class IntgradorEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double nota;
        String nombre;
        Estudiante vectorEstudiantes[] = new Estudiante[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese nombre del estudiante nº " + (i + 1));
            nombre = leer.next();
            System.out.println("Ingresar nota del estudiante nº " + (i + 1));
            nota = leer.nextDouble();

            vectorEstudiantes[i] = new Estudiante(nombre, nota);

        }
        
        double promedio = calcularPromedio(vectorEstudiantes);
        System.out.println("Promedio de notas del curso: " + promedio);
        
         String[] nombresSuperiorPromedio = obtenerNombresSuperiorPromedio(vectorEstudiantes, promedio);
        System.out.println("Estudiantes con notas superiores al promedio:");
        for (String nombre2 : nombresSuperiorPromedio) {
            System.out.println(nombre2);
        }

        System.out.println("Todos los estudiantes con notas superiores al promedio:");
        for (Estudiante estudiante : vectorEstudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - Nota: " + estudiante.getNota());
            }
        }
        

    }
    public static double calcularPromedio(Estudiante[] estudiantes) {
        double total = 0;
        for (Estudiante estudiante : estudiantes) {
            total += estudiante.getNota();
        }
        return total / estudiantes.length;
    }
    
 public static String[] obtenerNombresSuperiorPromedio(Estudiante[] estudiantes, double promedio) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                contador++;
            }
        }

        String[] nombresSuperiorPromedio = new String[contador];
        int index = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresSuperiorPromedio[index] = estudiante.getNombre();
                index++;
            }
        }

        return nombresSuperiorPromedio;
    }
    
}
