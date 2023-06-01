/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package coleccionesejer06;

import coleccionesejer06.ServicioProducto.ProductoService;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ColeccionesEjer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        Scanner leer = new Scanner(System.in);

        int opc;
  System.out.println("------------------------------Menu------------------------------");
            System.out.println("1-Ingresar producto.");
               ps.cargarProducto();
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
                            ps.cargarProducto();
                    break;
                case 2:
                        System.out.println("-----------------------Modificar precio-----------------------------");
                        ps.modificarPrecio();
                    break;
                case 3:
                        System.out.println("-------------------------Eliminar Producto---------------------------");
                        ps.eliminarProducto();
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
