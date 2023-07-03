package Entidades;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void DeQueSeAlimenta() {
        System.out.println("El perro " + this.nombre + " se alimenta de Dogui");
    }
    
}
