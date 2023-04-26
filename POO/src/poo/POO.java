/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de 
páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro 
método el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package poo;

import constructores.Libro;
import java.util.Scanner;


/**
 *
 * @author NENAS
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  Scanner leer = new Scanner(System.in);
   Libro l1= new Libro();
   
    System.out.println("Ingrese el ISBN");
    l1.ISBN=leer.next();
    System.out.println("Ingrese el autor");
    l1.autor=leer.next();
    System.out.println("Ingrese el titulo");
    l1.titulo=leer.next();
    System.out.println("Ingrese el pagina");
    l1.pagina=leer.nextInt();
  
    
        System.out.println(l1);

  
}
}