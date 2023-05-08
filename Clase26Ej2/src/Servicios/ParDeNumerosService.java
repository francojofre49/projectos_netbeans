/*
Método Static y Clase Math
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author Miguel Ángel
 */
public class ParDeNumerosService {

    //a)
    public void mostrarValores(ParDeNumeros nums) {
        System.out.println("El primer número es: " + nums.getNum1() + " Y el segundo es: " + nums.getNum2());
    }

    //b)
    public double devolverMayor(ParDeNumeros nums) {
        if (nums.getNum1() > nums.getNum2()) {
            return nums.getNum1();
        } else {

            return nums.getNum2();
        }
    }

    //c)
    
    public int calcularPotencia(ParDeNumeros nums){
        if (nums.getNum1() > nums.getNum2()) {
           
            return (int) Math.pow(nums.getNum1(), nums.getNum2());
        } else {

            return (int) Math.pow(nums.getNum2(), nums.getNum1());
        }
    }
    
    //d)
    public double calcularRaiz(ParDeNumeros nums){
        if (nums.getNum1() < nums.getNum2()) {
            double raizN1 = Math.abs(nums.getNum1());
            return  Math.sqrt(raizN1);
        } else {

            double raizN2 = Math.abs(nums.getNum2());
            return  Math.sqrt(raizN2);
        }
    }
}
