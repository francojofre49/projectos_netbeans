/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author NENAS
 */
public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int pagina;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int pagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Libro: \n - ISBN" + ISBN + ",\n  - titulo=" + titulo + ",\n - autor=" + autor + ",\n - pagina=" + pagina + '}';
    }
    
}
