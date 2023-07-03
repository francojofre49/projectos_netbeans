package Entidades;

import java.util.Scanner;

public class LavadoraService extends Lavadora {

    Scanner s = new Scanner(System.in).useDelimiter("\n");
    Lavadora lav = new Lavadora();
    
    public Lavadora CrearLavadora() {
        super.CrearElectrodomestico();
        System.out.print("Ingrese la capacidad de carga de la lavadora: ");
        int carga = s.nextInt();
        lav.setCarga(carga);
        int c = lav.getCarga();
        return new Lavadora(c, color, consumo, precio, peso);
    }

    public double PrecioLav(){
        double price = 500;
        if(super.getCarga() > 30){
            super.setPrecio(super.getPrecio() + price);
        }
         System.out.println("El precio Final del Producto es: " + super.getPrecio());
        return super.getPrecio();
    }
    
}
