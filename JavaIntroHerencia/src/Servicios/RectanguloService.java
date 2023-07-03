package Servicios;

import Entidades.Rectangulo;
import Interfaces.calculosFormas;
import java.util.Scanner;

public class RectanguloService implements calculosFormas  {

    Scanner s = new Scanner(System.in); 
    Rectangulo r = new Rectangulo();
    
    @Override
    public void IngresarValores() {
        System.out.print("Ingrese el valor de la base: ");
        r.setBase(s.nextInt());
        System.out.print("Ingrese el valor de la altura: ");
        r.setAltura(s.nextInt());
        System.out.println("");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El périmetro del rectángulo es: " + (r.getBase() * r.getAltura()));
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del rectángulo es: " +(r.getBase() * r.getAltura() ) * 2 );
    }

}
