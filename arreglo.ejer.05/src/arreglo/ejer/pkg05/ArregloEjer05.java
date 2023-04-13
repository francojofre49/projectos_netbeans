/*
 

Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta 
es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una
matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package arreglo.ejer.pkg05;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ArregloEjer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] matrizTrans = new int[3][3];

        System.out.println("ingresar 9 numeros enteros");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        mostrarMatriz(matriz);

        //hago la tranpuesta de la matriz
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizTrans[j][i] = matriz[i][j];
            }
        }
        mostrarMatriz(matrizTrans);
        boolean resp = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[i][j] + matrizTrans[i][j]) > 0) {

                    resp = true;
                    break;

                }
            }
        }

        if (!resp) {

            System.out.println("es una matriz antisimetrica");
        } else {
            System.out.println("no es una matriz  antisimétrica");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }

}
