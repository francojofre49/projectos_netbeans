/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Eze
 */
public class Juego {
    
    private RevolverDeAgua revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(RevolverDeAgua revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
    
}
