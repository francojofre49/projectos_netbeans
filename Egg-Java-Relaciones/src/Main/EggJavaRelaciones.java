/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Perro;
import Entidad.Persona;
import Enumeracion.sexoAnimal;
import Enumeracion.tamanioPerro;



/**
 *
 * @author danip
 */
public class EggJavaRelaciones {

    /**
     * @param args the command line arguments
     */
//    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Ezequiel", "Presta", 32, 35326347, null);
        
        Persona p2 = new Persona("Rosa", "Meltrozo", 18, 48546728, null);
        
        Perro m1 = new Perro("neron", "Pitbull", 6, sexoAnimal.MACHO, tamanioPerro.GRANDOTE);
        
        Perro m2 = new Perro("Mila", "Galgo", 5, sexoAnimal.HEMBRA, tamanioPerro.GRANDE);
        
        p1.setPerro(m1);
        p2.setPerro(m2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
    
}
