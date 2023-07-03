/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejer3;
import java.util.InputMismatchException;
import Entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Eze
 */
public class Guia13Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
//una división con los dos numeros y mostrar el resultado.
        
      

        try {
            String num1;
        String num2;
              Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el primer numero");
            num1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            num2 = leer.next();
            int uno = Integer.parseInt(num1);
            int dos = Integer.parseInt(num2);
            DivisionNumero dv1 = new DivisionNumero(uno, dos);
            System.out.println(dv1.dividir());

        } catch (InputMismatchException a) {
            System.out.println("Ingreso un numero demasiado largooo: "+a);

        } catch (NumberFormatException a) {

            System.out.println(" ERROR el valor ingresado no puede ser convertido a entero: "+a);

        } catch (ArithmeticException a) {

            System.out.println("No se puede dividir por 0: "+ a);

        }


    }

}
