/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package guia9ejerc5.PersonaService;

import guia9ejerc5.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class PersonaService {
    
   public Scanner leer = new Scanner(System.in);
   
   public Persona crearPersona(){
   Persona p1=new Persona();
   
       System.out.println("Ingresar el nombre ");
       p1.setNombre(leer.next());
       System.out.println("Ingrese su día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de nacimiento: ");
        int anio = leer.nextInt();
       Date d=new Date(anio-1900,mes-1,dia);
       p1.setFechaNac(d);
       
       return p1;

        
   }
   
   
   public int calcularEdad(Persona p1) {
       Date fechaActual=new Date();
        int anios = fechaActual.getYear() - p1.getFechaNac().getYear();
    
        if (fechaActual.getMonth() < p1.getFechaNac().getMonth()) {
            return anios=anios-1;
        } else if (fechaActual.getMonth() >= p1.getFechaNac().getMonth()) {
            if (fechaActual.getDay() >= p1.getFechaNac().getDay()) {
                return anios;
            } else {
                return anios=anios-1;
            }
        } 
        return anios;
    }
   
   
   public boolean menorQue(Persona p1, int edad){
       return calcularEdad(p1)<edad;
   
       }
   
   public void mostrarPersona(Persona p1){
   
       System.out.println(p1.toString());
   
   
   
   }
    
    
}
