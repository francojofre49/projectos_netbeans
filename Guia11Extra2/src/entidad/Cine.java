
package entidad;

import java.util.ArrayList;

public class Cine {
    private ArrayList<Persona> personas;
    private Asiento[][] sala ;
    private Pelicula pelicula;
    private Double precio = 100.0;

    public Cine() {
    }

    public Cine(Asiento[][] sala, Pelicula pelicula) {
        this.sala = sala;
        this.pelicula = pelicula;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }
    
    
    
    
}
