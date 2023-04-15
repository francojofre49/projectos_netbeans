/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejemplo;

import Entidad.Persona;

/**
 *
 * @author frank
 */
public class POOEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Para crear el objeto y asignar un espacio de memoria es necesario realizar la instanciación con el operador new. El operador new 
        //instancia el objeto y reserva espacio en memoria para los atributos y devuelve una referencia que se guarda en la variable.
        
                //Instanciacion utilizando el constructor vacio
        Persona primeraPersona=new Persona();
        
       
             //Instanciacion utilizando el constructor con parametros
        Persona segundaPersona=new Persona("franco",23,1);
        
     primeraPersona.setNombre("Ana");
     primeraPersona.setEdad(23);
     primeraPersona.setDni(12345678);
        
        System.out.println(primeraPersona.getNombre());
        
    }

    
}
