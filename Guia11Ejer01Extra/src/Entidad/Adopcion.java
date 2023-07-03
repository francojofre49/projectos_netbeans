/*
 *Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author frank
 */
public class Adopcion {
    
    private  ArrayList <Persona> personas;
    private ArrayList <Perro> perros;

    public Adopcion() {
    }

    public Adopcion(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        this.personas = personas;
        this.perros = perros;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "personas=" + personas + ", perros=" + perros + '}';
    }
    
    
    
}
