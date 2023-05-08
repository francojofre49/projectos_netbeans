/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Servicios;

import java.util.Arrays;



/**
 *
 * @author Miguel Ángel
 */
public class ArregloService {
    //1)
    public void inicializA(int[] A){
        
        for (int i = 0; i < 50; i++) {
            A[i] =  (int)Math.floor(Math.random()*50+1);
            
            
        }
    }
    //2)
    public void mostrar(int[] C){
        for (int i = 0; i < C.length; i++) {
            System.out.print("["+ C[i] +"]" );
        }
    }
    
    //3)
    public void ordenar(int[] C){
       Arrays.sort(C);
       int[] aux = new int[C.length];
       int J = C.length-1;
       for (int i = 0; i < C.length ; i++) {
            aux[i]= C[J];
            J--;
        }
       for (int i = 0; i < C.length ; i++) {
            C[i]= aux[i];
            
        }
       
       for (int i = 0 ; i >C.length ; i++) {
            System.out.print("["+ C[i] +"]" );
        }
    }
    
    //4)
    public void inicializarB(int[] B, int[] A){
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                B[i]= A[i];
            } else {
                B[i]= 5;
            }
             
        }
    }
}
