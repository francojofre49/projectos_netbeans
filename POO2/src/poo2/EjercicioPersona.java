/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author eglys
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
         está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.*/
        ServicioPersona sp = new ServicioPersona();
        boolean[] arregloEdad = new boolean[4];
        int[] arregloImc = new int[4];
        Persona per1 = sp.crearPersona();
        Persona per2 = sp.crearPersona();
        Persona per3 = sp.crearPersona();
        Persona per4 = sp.crearPersona();

        arregloEdad[0] = sp.esMayorDeEdad(per1);
        arregloEdad[1] = sp.esMayorDeEdad(per2);
        arregloEdad[2] = sp.esMayorDeEdad(per3);
        arregloEdad[3] = sp.esMayorDeEdad(per4);

        arregloImc[0] = sp.calcularIMC(per1);
        arregloImc[1] = sp.calcularIMC(per2);
        arregloImc[2] = sp.calcularIMC(per3);
        arregloImc[3] = sp.calcularIMC(per4);

       /* for (int i = 0; i < 4; i++) {
            System.out.println("edad"+arregloEdad[i]+" imc"+arregloImc[i]);
        }*/
        
        
        calcEdad(arregloEdad);
        calcImc(arregloImc);
    }

    public static void calcEdad(boolean[] arregloEdad) {
        float mayor = 0;
        float menor = 0;

        for (int i = 0; i < 4; i++) {

            if (arregloEdad[i]) {
                mayor++;

            } else {
                menor++;
            }

        }

        System.out.println("El porcentaje de personas mayores de edad es:" +(( mayor / 4 )* 100));
        System.out.println("El porcentaje de personas menores de edad es:" + ((menor / 4 )* 100));

    }

    public static void calcImc(int[] arregloImc) {
        float bajo = 0;
        float ideal = 0;
        float sobre = 0;

        for (int i = 0; i < 4; i++) {
            switch (arregloImc[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    sobre++;
                    break;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es de: "+bajo/4*100);
         System.out.println("El porcentaje de personas con  peso ideal es de: "+ideal/4*100);
          System.out.println("El porcentaje de personas con sobre peso es de: "+sobre/4*100);
    }

}
