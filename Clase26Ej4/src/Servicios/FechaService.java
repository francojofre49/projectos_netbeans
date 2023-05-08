/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class FechaService {

    public Scanner leer = new Scanner(System.in);

    //a)
    public Date fechaNacimiento() {
        System.out.println("Ingrese su día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de nacimiento: ");
        int anio = leer.nextInt();

        return new Date(anio-1900, mes-1, dia);
    }
    //b)

    public Date fechaActual() {
        Date fechaActual = new Date();
        int anioActual =fechaActual.getYear();
        fechaActual.setYear(anioActual);
        System.out.println("fecha actual " +  fechaActual.getYear());
        return fechaActual;
    }

    //c)
    public int difencia(Date C, Date fechaActual) {
        int anios = fechaActual.getYear() - C.getYear();
    
        if (fechaActual.getMonth() < C.getMonth()) {
            return anios=anios-1;
        } else if (fechaActual.getMonth() >= C.getMonth()) {
            if (fechaActual.getDay() >= C.getDay()) {
                return anios;
            } else {
                return anios=anios-1;
            }
        } 
        return anios;
    }
    
//    public int difencia(Date C, Date fechaActual) {
//        int anios = fechaActual.getYear() - C.getYear();
//        System.out.println("fecha actual " + fechaActual.getYear());
//        System.out.println("fecha nacimiento " + C.getYear());
//        return anios;
//    }
}
