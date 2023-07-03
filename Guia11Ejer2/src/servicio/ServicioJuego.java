/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eze
 */
public class ServicioJuego {

    Scanner leer = new Scanner(System.in);

    Juego juego1;
    ServicioRevolver sr = new ServicioRevolver();

    public Juego llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua revolver = new RevolverDeAgua();

        System.out.println("****************************");
        System.out.println("Ingrese la cantidad de jugadores:");
        int cantidad = leer.nextInt();
        if (cantidad > 6) {

            cantidad = 6;

        }

        for (int i = 0; i < cantidad; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            j.setNombre(j.getNombre().concat(String.valueOf(j.getId())));

            jugadores.add(j);
        }

        System.out.println("Cantidad de jugadores cargados " + jugadores.size());

        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);

        }
        sr.llenarRevolver(revolver);

        return juego1 = new Juego(revolver, jugadores);
    }

//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(Juego juego1) {
        System.out.println("**********INICIO JUEGO*******************");
        ServicioRevolver sr = new ServicioRevolver();
        System.out.println("--------------------- ");
        sr.mostrarRevolver(juego1.getRevolver());
        System.out.println("----------------------");
        boolean fin=false;
        do{
        for (Jugador jugador : juego1.getJugadores()) {
            System.out.println("Turno del jugador " + jugador.getNombre());
            if (sr.mojar(juego1.getRevolver())) {
                System.out.println(jugador.getNombre() + " Te has disparado!!!!!!!");
                fin=true;
                break;
            } else {
                System.out.println(jugador.getNombre() + " Te has salvado!!!!!!!");
                sr.siguienteChorro(juego1.getRevolver());
                sr.mostrarRevolver(juego1.getRevolver());

            }
            System.out.println("\n\t\t\t\t\tPresion ENTER para continuar.");
            String seguir = leer.next();
        }
        }while(!fin);
        System.out.println("*****FIN DEL JUEGO***************");
    }

}
