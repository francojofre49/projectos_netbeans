/*
  *Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Service;

import Entidad.Adopcion;
import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ServicioAdopcion {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Persona> personas = new ArrayList();
    private ArrayList<Perro> perros = new ArrayList();

    public Adopcion ingresarPerrosPersonas() {

        Adopcion a = new Adopcion();

//        private String nombre;
//    private String raza;
//    private Integer edad;
//    private String sexoAnimal ;
//    private String tamanioPerro ;
//    private boolean adoptado=false;
        System.out.println("----------------------Ingresar Perros--------------------");
        String resp = "s";
        do {
            Perro p = new Perro();
            System.out.println("Ingresar nombre del perro");
            p.setNombre(leer.next());
            System.out.println("Ingresar Raza");
            p.setRaza(leer.next());
            System.out.println("Ingresar Edad");
            p.setEdad(leer.nextInt());
            System.out.println("Ingresar Sexo");
            p.setSexoAnimal(leer.next());
            System.out.println("Ingresar Tamaño");
            p.setTamanioPerro(leer.next());

            perros.add(p);
            System.out.println("Desea ingresar otro perro?(s/n)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));

//          private String nombre;
//    private String apellido;
//    private Integer edad;
//    private Integer documento;
        resp = "s";
        System.out.println("----------------------Ingresar Personas--------------------");

        do {
            Persona p1 = new Persona();
            System.out.println("Ingresar nombre");
            p1.setNombre(leer.next());
            System.out.println("Ingresar apellido");
            p1.setApellido(leer.next());
            System.out.println("Ingresar edad");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingresar DNI");
            p1.setDocumento(leer.nextInt());

            personas.add(p1);

            System.out.println("Desea ingresar otra persona?(s/n)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        a.setPerros(perros);
        a.setPersonas(personas);
        return a;
    }

    public void adoptar(Adopcion a) {

        for (Persona persona : a.getPersonas()) {
            System.out.println("Che " + persona.getNombre() + " que perro quere?");
            for (Perro perro : a.getPerros()) {

                System.out.print(" " + perro.getNombre() + ",");

            }

            String Adoptado = leer.next();
            for (int i = 0; i < a.getPerros().size(); i++) {

                if (a.getPerros().get(i).getNombre().equals(Adoptado)) {
                    if (a.getPerros().get(i).isAdoptado()) {

                        System.out.println("El perro ya tiene dueño");
                    } else {
                        persona.setPerro(a.getPerros().get(i));
                        a.getPerros().get(i).setAdoptado(true);
                    }
                }

            }

        }

    }
    
   public void mostrarPersonaConSuPerroAdoptadoDijoLaPaola(Adopcion a){
   
       for (Persona persona : a.getPersonas()) {
           System.out.println(persona);
       }
   }

}
