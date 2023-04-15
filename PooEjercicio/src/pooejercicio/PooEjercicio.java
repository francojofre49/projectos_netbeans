/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooejercicio;

import Entidad.Circunferencia;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class PooEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo=new Circunferencia(0);
       crearCircunferencia(circulo); 
       area(circulo);
                
    
        
    }
    
    public static void crearCircunferencia(Circunferencia circulo){
        
          Scanner leer = new Scanner(System.in);
          
            System.out.println("Ingrese radio");
       circulo.setRadio(leer.nextFloat());
   
    
    }
    
    public static double area(Circunferencia circulo){
    double area=(3.14*circulo.getRadio());
    return sqrt(area);
    
    }
}
