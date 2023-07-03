/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package guia11ejer01extra;

import Entidad.Adopcion;
import Service.ServicioAdopcion;

/**
 *
 * @author frank
 */
public class Guia11Ejer01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServicioAdopcion sa=new ServicioAdopcion();
        
     Adopcion a =sa.ingresarPerrosPersonas();
        sa.adoptar(a);
        sa.mostrarPersonaConSuPerroAdoptadoDijoLaPaola(a);
        
    }
    
}
