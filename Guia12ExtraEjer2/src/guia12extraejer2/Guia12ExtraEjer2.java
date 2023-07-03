/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extraejer2;

import java.util.ArrayList;
import entidad.Edificio;
import entidad.EdificioDeOficina;
import entidad.Polideportivo;

/**
 *
 * @author frank
 */
public class Guia12ExtraEjer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList< Edificio> lista = new ArrayList<>();

        Polideportivo pol1 = new Polideportivo();
        pol1.crearPolideportivo();
        lista.add(pol1);
        Polideportivo pol2 = new Polideportivo();
        pol2.crearPolideportivo();
        lista.add(pol2);

        EdificioDeOficina eO = new EdificioDeOficina();
        eO.crearEdificioOficina();
        lista.add(eO);
        EdificioDeOficina eO2 = new EdificioDeOficina();
        eO2.crearEdificioOficina();
        lista.add(eO2);

        for (Edificio edificio : lista) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        int techado = 0;
        int abierto = 0;

        for (Edificio edificio : lista) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.isTechado()) {
                    techado++;
                } else {
                    abierto++;
                }
            } else {

                EdificioDeOficina eD = (EdificioDeOficina) edificio;
                eD.cantPersonas();
            }
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("La cantidad de polideportivos abiertos son: " + abierto);
        System.out.println("La cantidad de polideportivos techados son: " + techado);

    }

}
