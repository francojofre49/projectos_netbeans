package Servicios;

import Entidades.Circulo;
import Interfaces.calculosFormas;
import java.util.Scanner;

public class CirculoService implements calculosFormas {

    Scanner s = new Scanner(System.in);
    Circulo c = new Circulo();

    @Override
    public void IngresarValores() {
        System.out.print("Ingrese el valor del radio: ");
        c.setRadio(s.nextDouble());
        System.out.println("");
    }

    @Override
    public void calcularArea() {
        double res = pi * Math.pow(c.getRadio(), 2);
        System.out.println("El área del círculo es: " + res);
    }

    @Override
    public void calcularPerimetro() {
        double res = pi * c.getRadio();
        System.out.println("El perímetro del círculo es: " + res);
    }

}
