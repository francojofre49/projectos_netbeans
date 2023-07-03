/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class EdificioDeOficina extends Edificio {

    protected int cantOficinas;
    protected int cantPersonasOficina;
    protected int cantPisos;
    Scanner leer = new Scanner(System.in);

    public void crearEdificioOficina() {
        System.out.println("---------------------Ingresar Edificio de Oficinas--------------");

        System.out.println("Ingresar ancho Edificio de Oficinas");
        ancho = leer.nextDouble();
        System.out.println("Ingresar largo Edificio de Oficinas");
        largo = leer.nextDouble();
        System.out.println("Ingresar alto Edificio de Oficinas");
        alto = leer.nextDouble();

    }

    public void cantPersonas() {
        System.out.println("Ingresar cantidad de pisos");
        cantPisos = leer.nextInt();
        System.out.println("Ingresar cantidad de oficinas por piso");
        cantOficinas = leer.nextInt();
        System.out.println("Ingresar cantidad de personas por oficina");
        cantPersonasOficina=leer.nextInt();
        System.out.println("La cantidad de personas que entran en un piso es de: "+ cantPersonasOficina*cantOficinas );
         System.out.println("La cantidad de personas que entran en todo el edificio es de: :"+ cantPersonasOficina*cantOficinas*cantPisos );

    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio de oficinas es: " + ancho * largo);
          System.out.println(" ");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio de oficina es: " + ancho * largo * alto);
          System.out.println(" ");
    }

}
