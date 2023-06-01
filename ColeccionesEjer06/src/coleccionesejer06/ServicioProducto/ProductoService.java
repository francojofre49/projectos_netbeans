/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package coleccionesejer06.ServicioProducto;

import coleccionesejer06.entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> productoMapa = new HashMap();

    Producto producto = new Producto();

    public void cargarProducto() {
        String resp;
        do {
            System.out.println("Ingresar nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingresar precio del producto:");
            double precio = leer.nextDouble();

            productoMapa.put(nombre, precio);

            System.out.println("Desea seguir ingresando productos?");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("s"));

    }

    public void modificarPrecio() {
        System.out.println("Ingresar nombre del producto que desea modificar el precio");
        String nombre = leer.next();
        boolean encontrado = false;
        for (String producto : productoMapa.keySet()) {
            if (producto.equalsIgnoreCase(nombre)) {
                encontrado = true;

            }

        }
        
        if(encontrado){

        System.out.println("Ingresar nuevo precio de producto");
        double precio = leer.nextDouble();

        productoMapa.replace(nombre, precio);
                }else{
            System.out.println("no se encuentra el producto en la lista");
        
        }

    }

    public void eliminarProducto() {
        System.out.println("Ingresar nombre del producto a eliminar");
        String nombre = leer.next();
           boolean encontrado = false;
        for (String producto : productoMapa.keySet()) {
            if (producto.equalsIgnoreCase(nombre)) {
                encontrado = true;

            }

        }
        
        if(encontrado){
  productoMapa.remove(nombre);
                }else{
            System.out.println("no se encuentra el producto en la lista");
        
        }
        
        
        
      

    }

    public void mostrarProducto() {

        for (Map.Entry<String, Double> entry : productoMapa.entrySet()) {

            System.out.println("nombre producto: " + entry.getKey() + " precio: " + entry.getValue());

        }

    }

}
