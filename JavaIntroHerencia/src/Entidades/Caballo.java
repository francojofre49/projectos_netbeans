package Entidades;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
 
    @Override
    public void DeQueSeAlimenta() {
       System.out.println("El caballo " + this.nombre + " se alimenta de pasto");
    }
    
}