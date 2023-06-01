/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer06v2;

import coleccionesejer06v2.Servicio.ProductoService;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ColeccionesEjer06v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProductoService ps = new ProductoService();
        Scanner leer = new Scanner(System.in);

        int opc;
  System.out.println("------------------------------Menu------------------------------");
            System.out.println("1-Ingresar producto.");
               ps.ingresarProducto();
        do {
            System.out.println("------------------------------Menu------------------------------");
            System.out.println("1-Ingresar producto.");
            System.out.println("2-Modificar precio ");
            System.out.println("3-Eliminar producto");
            System.out.println("4-Mostrar productos ");
            System.out.println("5-SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:System.out.println("--------------------Ingresar producto----------------------");
                            ps.ingresarProducto();
                    break;
                case 2:
                        System.out.println("-----------------------Modificar precio-----------------------------");
                        ps.modificarPrecio();
                    break;
                case 3:
                        System.out.println("-------------------------Eliminar Producto---------------------------");
                        ps.borrarProducto();
                    break;
                case 4:
                        System.out.println("---------------------------Mostrar producto-----------------------------");
                        ps.mostrarProducto();
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
