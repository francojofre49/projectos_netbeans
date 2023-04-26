/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooejer02;

import Entidad.Circunferencia;

/**
 *
 * @author frank
 */
public class PooEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c=new Circunferencia(0);
        c.crearCircunferencia();
        c.setRadio(15);
        System.out.println(c.getRadio());
        System.out.println("Area:"+c.area());
        System.out.println("Perimetro"+ c.perimetro()); 
       
        
    }
    
}
