package Main;

import Servicios.CirculoService;
import Servicios.RectanguloService;

public class Ejer4 {

    public static void main(String[] args) {

        CirculoService c1 = new CirculoService();
        c1.IngresarValores();
        c1.calcularArea();
        c1.calcularPerimetro();
        
        System.out.println("");
        
        RectanguloService r1 = new RectanguloService();
        r1.IngresarValores();
        r1.calcularArea();
        r1.calcularPerimetro();
    }

}
