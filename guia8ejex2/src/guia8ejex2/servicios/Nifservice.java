/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejex2.servicios;

import guia8ejex2.entidades.NIFs;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Nifservice {
    /*a)Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
    letra que le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion 
    y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un
    método que funciona de la siguiente manera: Para calcular la letra se toma el 
    resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
*/
    NIFs n1 = new NIFs();
    Scanner leer = new Scanner ( System.in);
    
    
    public void crearNif(){
        System.out.println("Ingrese su DNI");
        n1.setDNI(leer.nextLong());
        int resto = (int) (n1.getDNI() % 23);
        char[] tablaCaracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        n1.setLetra(tablaCaracteres[resto]);
    }
    public void mostrar(){
        System.out.println("el NIF es " + n1.getDNI() + "-" + n1.getLetra());
    }
}
