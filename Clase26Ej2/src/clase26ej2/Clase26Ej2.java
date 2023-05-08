/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26ej2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author Miguel Ángel
 */
public class Clase26Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ParDeNumerosService serNum = new ParDeNumerosService();
        
        ParDeNumeros numPar = new ParDeNumeros();
        // mostramos
        serNum.mostrarValores(numPar);
        
        System.out.println("El número mayor es: " + serNum.devolverMayor(numPar));
        
        System.out.println("La potencias son: " + serNum.calcularPotencia(numPar));
        
        System.out.println("La raiz cuadrada del menor valor es: " + serNum.calcularRaiz(numPar));
    }
    
}
