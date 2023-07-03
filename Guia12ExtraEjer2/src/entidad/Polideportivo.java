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
public class Polideportivo extends Edificio {

    protected String nombre;
    protected boolean techado;
    Scanner leer = new Scanner(System.in);

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public void crearPolideportivo() {
        System.out.println("---------------------ingresar polideportivo--------------------");
        System.out.println("Ingresar nombre del polideportivo");
        nombre = leer.next();
        System.out.println("Ingrese si es techado o no (s/n)");
        techado = leer.next().equalsIgnoreCase("s");

        System.out.println("Ingresar ancho polideportivo");
        ancho = leer.nextDouble();
        System.out.println("Ingresar largo polideportivo");
        largo = leer.nextDouble();
        System.out.println("Ingresar alto polideportivo");
        alto = leer.nextDouble();

    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo "+ nombre +" es: " + ancho * largo);
        System.out.println(" ");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo "+ nombre +" es: " + ancho * largo * alto);
          System.out.println(" ");
    }

}
