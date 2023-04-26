/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número 
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Juego {

    private int jugador1;
    private int jugador2;
    private int cantInt;
    private int numA;
  private int cont;

    public Juego() {
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getCantInt() {
        return cantInt;
    }

    public void setCantInt(int cantInt) {
        this.cantInt = cantInt;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void adivinar() {

        while (cantInt > 0) {
            Scanner leer = new Scanner(System.in);
            System.out.println("J2-Ingresa un numero");

            if (numA == leer.nextInt()) {
                System.out.println("Adivinaste el numero, juego terminado");
                jugador2++;
                cont++;
                break;
            }
            System.out.println("No adivinaste, te quedan " + (cantInt - 1)+ " intentos");
cont++;
            cantInt--;

        }
if(cantInt==0)
{jugador1++;
    }}
    
    public void estadisticas(){
    
        System.out.println("puntos de jugador1:" + jugador1);
         System.out.println("puntos de jugador2:" + jugador2);
         if (cantInt==0){
             System.out.println("El jugador 2 no adivino el numero");
         }
         else{
         System.out.println("El jugador 2 necesito "+cont);}
    cont=0;
    
    }

}
