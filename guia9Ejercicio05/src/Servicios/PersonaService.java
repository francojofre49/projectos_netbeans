
  /* Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.*/

package Servicios;

import Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class PersonaService {

   
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
public Persona crearPersona() {
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);
    
    System.out.println("ingrese el nombre de la persona");
    p1.setNombre(leer.next());
    System.out.println("ingrese el año");
    int año = leer.nextInt();
    System.out.println("ingrese el mes");
    int mes = leer.nextInt();
    System.out.println("ingrese el dia");
    int dia = leer.nextInt();
    Date fecha = new Date(año - 1900, mes-1,dia);
     p1.setNacimiento(fecha);
    System.out.println("nombre: " + p1.getNombre());
    System.out.println("datos de fecha " + p1.getNacimiento());
  
   return p1;
    }
 // Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
  public void calcularEdad(Persona persona) {
    int anioNacimiento = persona.getNacimiento().getYear();

        // Obtener el año actual usando un objeto Calendar
        Calendar calendar = Calendar.getInstance();
        int anioActual = calendar.get(Calendar.YEAR);

        // Calcular la diferencia de años entre el año actual y el año de nacimiento
        int edad = anioActual - (anioNacimiento + 1900);
        System.out.println("edad: " + edad);

  }  
  }     
  
 
 
   
    
    

