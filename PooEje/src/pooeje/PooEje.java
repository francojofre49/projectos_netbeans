/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje;
import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class PooEje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        Persona p1 =new Persona();
        
        Persona p2=new Persona("franco",24,"1234124214");
        
        System.out.println("ingrese nombre");
        
        
        p1.setNombre(leer.next());
        p1.setEdad(23);
        p1.setDni("12313213132");
        
        System.out.println(p1.getNombre());
        
    }
    
   
}
