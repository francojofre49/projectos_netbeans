package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejer1 {

    public static void main(String[] args) {
       
        Animal p1 = new Perro("Osa", "Dogui", "Callejero", 7);
        p1.DeQueSeAlimenta();
        
        Animal p2 = new Perro("Nerón", "Dogui", "Husky", 9);
        p2.DeQueSeAlimenta();
        
        Animal g1 = new Gato("Ricahrd Parker", "CatPro", "Naranjoso", 1);
        g1.DeQueSeAlimenta();
        
        Animal c1 = new Caballo("Spark", "Pasto", "Fino", 25);
        c1.DeQueSeAlimenta();
        
    }
    
}
