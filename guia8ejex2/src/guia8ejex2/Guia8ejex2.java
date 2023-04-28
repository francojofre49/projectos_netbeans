/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejex2;

import guia8ejex2.servicios.Nifservice;

/**
 *
 * @author Juan
 */
public class Guia8ejex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nifservice nif = new Nifservice();
        nif.crearNif();
        nif.mostrar();
    }
    
}
