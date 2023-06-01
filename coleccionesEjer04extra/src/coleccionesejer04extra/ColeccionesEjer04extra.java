/*
 Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
 */
package coleccionesejer04extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ColeccionesEjer04extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    HashMap <Integer,String> postalMapa =new HashMap();
        Scanner leer = new Scanner(System.in);
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar el codigo postal ");
            Integer codigo=leer.nextInt();
            System.out.println("Ingresar nombre de la ciudad");
            String nombre=leer.next();
           postalMapa.put(codigo, nombre);
            
            
        }
        
         for (Map.Entry<Integer, String> entry : postalMapa.entrySet()) {

            System.out.println("C.P: " + entry.getKey() + " Nombre de la ciudad: " + entry.getValue());
            
        }
        
            System.out.println("Ingresar C.P");
      Integer mostrar=leer.nextInt();
           boolean encontrado = false;
      for (Map.Entry<String, Double> entry2 : productoMapa.entrySet()) {

            System.out.println("nombre producto: " + entry2.getKey() + " precio: " + entry2.getValue());

        
        
        if(encontrado){
            System.out.println("la ciudad correspondiente a ese codigo es:"+postalMapa.get());
                }else{
            System.out.println("no se encuentra el producto en la lista");
        
        }
        
        
    }
    
}
