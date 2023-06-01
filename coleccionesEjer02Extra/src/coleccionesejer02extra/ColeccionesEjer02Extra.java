/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.

 */
package coleccionesejer02extra;

import coleccionesejer02extra.Entidad.CantanteFamoso;
import coleccionesejer02extra.Servicio.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class ColeccionesEjer02Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList <CantanteFamoso> lista=new ArrayList();
      
     CantanteFamosoService cf=new CantanteFamosoService();

     
        Scanner leer = new Scanner(System.in);
String prueba;
        int opc;
           do {
  System.out.println("------------------------------Menu------------------------------");
  
  prueba=JOptionPane.showInputDialog("Ingresar 5 cantantes");
  
  JOptionPane.showMessageDialog(null, "El cante ingresado es "+prueba);
            System.out.println("1-Ingresar 5 cantantes.");
            System.out.println("2-Mostrar lista de cantantes.");
            System.out.println("3-Ingresar un cantante ");
            System.out.println("4-Eliminar un cantante");
            System.out.println("5-SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:System.out.println("--------------------Ingresar 5 cantantes---------------------");
                     cf.agregarCantante(lista);
                    break;
                case 2:
                        System.out.println("-----------------------Mostrar Cantantes-----------------------------");
                    cf.mostrar(lista);
                    break;
                case 3:
                        System.out.println("-------------------------Ingresar un Cantante---------------------------");
                        cf.agregarCantante2(lista);
                    break;
                case 4:
                        System.out.println("---------------------------Eliminar Cantante-----------------------------");
                       cf.eliminarCantante(lista);
                    break;
                case 5:
                            System.out.println("Gracias por usar esta poronga de programa");
                    break;
                default:
                    System.out.println("opcion no valida ");
            }
            
            
        } while (opc < 5);
      
    }
    
}
