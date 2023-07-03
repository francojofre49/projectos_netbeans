/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package javaapplication69;

import Entidad.Baraja;
import Servicio.ServicioBaraja;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ServicioBaraja sb =new ServicioBaraja();
        Baraja baraja = sb.cargarMaso();
        
        int opc;
        
        
        do{
              System.out.println("---------------------------------------JUEGO BARAJA---------------------------------------");
            System.out.println("1-Barajar");
            System.out.println("2-Siguiente carta");
            System.out.println("3-Cartas disponibles");
            System.out.println("4-Dar cartas");
            System.out.println("5-Mostrar cartas que salieron");
            System.out.println("6-Mostrar baraja");
            System.out.println("0-SALIR");
            
            opc=leer.nextInt();
            
            switch (opc) {
                case 1:
                    sb.barajar(baraja);
                    break;
                case 2:
                    sb.siguienteCarta(baraja);
                    break;
               case 3:
                    sb.cartasDisponibles(baraja);
                    break;
               case 4:
                    sb.darCartas(baraja);
                    break;
              case 5:
                    sb.cartasMonton();
                    break;
              case 6:
                    sb.mostrarBaraja(baraja);
                    break;
               case 0:
                    System.out.println("Saliendo del juego.......");
                    break;
                    
                default:
                    throw new AssertionError();
            }
        
        
        
        
        
        }while(opc!=0);
        
        
        
        
    }
    
}
