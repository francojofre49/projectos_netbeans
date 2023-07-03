package Entidades;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
  
    @Override
    public void DeQueSeAlimenta() {
       System.out.println("El gato " + this.nombre + " se alimenta de CatPro");
    }
    
}