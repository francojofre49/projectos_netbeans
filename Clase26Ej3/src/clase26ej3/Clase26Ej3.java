/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package clase26ej3;

import Servicios.ArregloService;

/**
 *
 * @author Miguel Ángel
 */
public class Clase26Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = new int[50];
        int[] B = new int[20];
        
        ArregloService arre = new ArregloService();
        
        arre.inicializA(A);
        arre.mostrar(A);
        System.out.println(" ");
        arre.ordenar(A);
        arre.inicializarB(B, A);
        arre.mostrar(A);
        System.out.println(" ");
        arre.mostrar(B);
    }
    
}
