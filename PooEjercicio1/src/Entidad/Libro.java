/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Libro {
    //atributos
    public String ISBN ;
    public String titulo;
    public String autor;
    public int paginas;
//contructores
    public Libro() {
    }

    
    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

  

  
  public  void pedirDatos(){
      Scanner leer = new Scanner(System.in);
        
        
      System.out.println("Ingrese Titulo del libro");
        titulo=leer.next();
        System.out.println("Ingrese ISBN");
        ISBN=leer.next();
        System.out.println("Ingrese autor del libro  "+titulo);
        autor=leer.next();
        System.out.println("Ingrese cantidad de paginas");
       paginas=leer.nextInt();
    
    
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

    
    
    
    
    
    
    
}
