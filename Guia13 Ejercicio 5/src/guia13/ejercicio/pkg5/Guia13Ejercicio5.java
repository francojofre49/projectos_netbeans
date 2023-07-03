/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia13.ejercicio.pkg5;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class Guia13Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");

        while (!adivinado) {
            try {
                System.out.print("Introduce un número entre 1 y 500: ");
                int numeroUsuario = sc.nextInt();
                intentos++;
                if(numeroUsuario>0 && numeroUsuario<501){
                if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (numeroUsuario > numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    adivinado = true;
                    System.out.println("¡Has adivinado el número! Era " + numeroAdivinar);
                    System.out.println("Número de intentos: " + intentos);
                }}
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido.");
                intentos++;
                sc.nextLine(); // Limpiar el buffer de entrada
            }
        }

        
    
    }
    
}
