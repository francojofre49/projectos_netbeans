/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.






 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in);
    Baraja baraja = new Baraja();
    ArrayList<Carta> monton = new ArrayList();

    public Baraja cargarMaso() {
        List<Carta> aux = new ArrayList();
        for (int i = 1; i < 13; i++) {

            if (!(i == 8 || i == 9)) {
                Carta carta = new Carta();

                carta.setValor(i);
                carta.setPalo("ESPADA");
                aux.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {

            if (!(i == 8 || i == 9)) {
                Carta carta = new Carta();

                carta.setValor(i);
                carta.setPalo("ORO");
                aux.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {

            if (!(i == 8 || i == 9)) {
                Carta carta = new Carta();

                carta.setValor(i);
                carta.setPalo("BASTO");
                aux.add(carta);
            }
        }
        for (int i = 1; i < 13; i++) {

            if (!(i == 8 || i == 9)) {
                Carta carta = new Carta();

                carta.setValor(i);
                carta.setPalo("COPA");
                aux.add(carta);
            }
        }
        baraja.setBaraja(aux);
      
        return baraja;
    }

//    barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Baraja baraja) {
        System.out.println("---------------------------------------BARAJAR MAZO---------------------------------------");
        Collections.shuffle(baraja.getBaraja());

    
     

    }

//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(Baraja baraja) {
        System.out.println("---------------------------------------SIGUIENTE CARTA---------------------------------------");

        String resp = "s";

        do {
            System.out.println(baraja.getBaraja().get(0));
            monton.add(baraja.getBaraja().get(0));
            baraja.getBaraja().remove(0);
            System.out.println("Desea seguir sacando cartas?(s/n)");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("s") && (baraja.getBaraja().size() > 0));

        if (baraja.getBaraja().size() == 0) {
            System.out.println("No hay mas cartas en el maso");
        }

    }

//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(Baraja baraja) {

        System.out.println("---------------------------------------CARTAS DISPONIBLE---------------------------------------");
        System.out.println(baraja.getBaraja().size()+" cartas ");

    }

//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas(Baraja baraja) {
        System.out.println("---------------------------------------DAR CARTAS---------------------------------------");

        System.out.println("Ingrese la cantidad de cartas que quiere:");
        int cantidad = leer.nextInt();

        if (baraja.getBaraja().size() >= cantidad) {

            for (int i = 0; i < cantidad; i++) {

                monton.add(baraja.getBaraja().get(0));
                baraja.getBaraja().remove(0);

            }

        }else{
        
            System.out.println("Quedan menos de "+cantidad+" cartas en el maso");
                }

    }
    
//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    
    public void cartasMonton(){
         System.out.println("---------------------------------------CARTAS MONTON---------------------------------------");
    if(monton.size()>0){
        for (Carta carta : monton) {
            System.out.println(carta);
        }
    
    }else{
        System.out.println("No ha salido ninguna carta");
    
    }
    
    
    }
    
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    
    public void mostrarBaraja(Baraja baraja){
      System.out.println("---------------------------------------CARTAS BARAJA---------------------------------------");
    
        for (Carta carta : baraja.getBaraja()) {
            System.out.println(carta);
        }
    }

}
