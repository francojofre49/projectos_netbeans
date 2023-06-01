/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejer01;

import Entidad.Perro;
import Entidad.Persona;
import Enumeracion.sexoAnimal;
import Enumeracion.tamanioPerro;

/**
 *
 * @author frank
 */
public class Guia11Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          
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
