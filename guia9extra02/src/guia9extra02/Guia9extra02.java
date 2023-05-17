/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extra02;

import guia9extra02.Entidad.Ahorcado;
import guia9extra02.Servicios.AhorcadoService;

/**
 *
 * @author frank
 */
public class Guia9extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AhorcadoService as = new AhorcadoService();
    Ahorcado a= as.crearJuego();
    as.juego(a);
     
       
    }
    
}
