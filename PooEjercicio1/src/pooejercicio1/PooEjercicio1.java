/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package pooejercicio1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class PooEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        pedirDatos();
      
        
        
        System.out.println("El titulo del libro es:"+libro.getTitulo()+", su ISBN es "+libro.getISBN()+", su autor es "+libro.getAutor()+" y su cantidad de paginas es "+libro.getPaginas());
    }
    
    public static void pedirDatos(){
      Scanner leer = new Scanner(System.in);
        
         Libro libro=new Libro();
      System.out.println("Ingrese Titulo del libro");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingrese ISBN");
        libro.setISBN(leer.next());
        System.out.println("Ingrese autor del libro "+libro.getTitulo());
        libro.setAutor(leer.next());
        System.out.println("Ingrese cantidad de paginas");
        libro.setPaginas(leer.nextInt());
    
    
    }
    
}
