/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejer1;

import entidad.Cadena;

import servicio.ServicioCadena;

/**
 *
 * @author Eze y Tahi
 */
public class Guia9Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCadena sc = new ServicioCadena();

        Cadena c1 = sc.crearCadena();

        sc.mostrarVocales(c1);
        sc.invertirFrase(c1);
        sc.mostrarCadena(c1);
        sc.vecesRepetido(c1);
        sc.compararLongitud(c1);
        sc.unirFrases(c1);
        sc.reemplazar(c1);
        sc.contiene(c1);

    }

}
