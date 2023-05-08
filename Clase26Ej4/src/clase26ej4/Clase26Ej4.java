/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package clase26ej4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Miguel Ángel
 */
public class Clase26Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService fechas = new FechaService();
        
        Date fechaNacimiento = fechas.fechaNacimiento();
        Date fechaActual = fechas.fechaActual();
        System.out.println(fechaActual);
        int anios=fechas.difencia(fechaNacimiento, fechaActual);
        System.out.println(anios);
    }
    
}
