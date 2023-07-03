/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Jugador;
import entidad.RevolverDeAgua;

/**
 *
 * @author Eze
 */
public class ServicioJugador {
    
    ServicioRevolver sr = new ServicioRevolver();
    
    
    public boolean disparo(RevolverDeAgua revolver, Jugador jugador){
        
        
        if ( sr.mojar(revolver)) {
            
            jugador.setMojado(true);
            return true;
           
        }  else{
            
            sr.siguienteChorro(revolver);
            return  false;
        }
    
    
}
}