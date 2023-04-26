/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package serviciosejer02.Servicios;

import java.util.Scanner;
import serviciosejer02.Entidad.Cafetera;

/**
 *
 * @author frank
 */
public class ServicioCafetera {
    
      Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera c1 =new Cafetera();
        System.out.println("Ingresar capacidad maxima");
        c1.setCapacidadMaxima(leer.nextInt());
        c1.setCantidadActual(c1.getCapacidadMaxima());
return c1;
    }

    public void servirTaza(Cafetera c1) {
        Scanner leer = new Scanner(System.in);

        int taza;
        System.out.println("Ingresar tamaño de la taza:");
        taza = leer.nextInt();
        if (c1.getCantidadActual() >= taza) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se sheno la taza");

        } else {
            System.out.println("No se lleno la taza, y la taza quedo en " + c1.getCantidadActual());
        }

    }
    
    public void  vaciarCafetera(Cafetera c1){
    
    c1.setCantidadActual(0);
        System.out.println("C vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera c1){
        
        int a;
        do{
        System.out.println("Ingresar cantidad de cafe");
        
        a=leer.nextInt();
        if(a<=c1.getCapacidadMaxima()){
        c1.setCantidadActual(c1.getCantidadActual()+a);}
        else{
            System.out.println("Supero cantidad maxima de cafe, intentelo de nuevo gorriado");
        }
        }while(a>c1.getCapacidadMaxima());
    
    }

}
