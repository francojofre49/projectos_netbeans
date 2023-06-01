/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer05.Entidad;

import java.util.Comparator;

/**
 *
 * @author frank
 */
public class Pais {
    
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    public static Comparator<Pais> ordenarPais=new Comparator<Pais>() {
    @Override
    public int compare(Pais pais1, Pais pais2 ){
    return pais1.getNombre().compareTo(pais2.getNombre());
    }
    
    
    };
    
    
    
}
