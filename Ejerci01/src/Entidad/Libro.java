/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Libro {
    //atributos

    public String ISBN;
    public String autor;
    public String titulo;
    public int paginas;

    public Libro() {
    }

    public Libro(String ISBN, String autor, String titulo, int paginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void cargarLibro() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese titulo del libro");
        titulo = leer.next();
        System.out.println("Ingrese autor del libro");
        autor = leer.next();
        System.out.println("Ingrese ISBN");
        ISBN = leer.next();
        System.out.println("Ingrese numero de paginas");
        paginas = leer.nextInt();

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + ", paginas=" + paginas + '}';
    }

}
