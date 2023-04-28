/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosejerextra01;

import java.util.Scanner;
import serviciosejerextra01.Entidad.Raiz;
import serviciosejerextra01.ServicioRaices.ServicioRaiz;

/**
 *
 * @author frank
 */
public class ServiciosEjerExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Ingresar a");
        a = leer.nextDouble();
        System.out.println("Ingresar b");
        b = leer.nextDouble();
        System.out.println("Ingresar c ");
        c = leer.nextDouble();
        Raiz r = new Raiz(a, b, c);
        ServicioRaiz sr= new ServicioRaiz();
        
        sr.getDiscriminante(r);
        sr.tieneRaices(r);
        sr.tieneRaiz(r);
        sr.obtenerRaices(r);
        sr.obtenerRaiz(r);
        sr.calcular(r);

    }

}
