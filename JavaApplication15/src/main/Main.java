
package main;

import entidad.CuentaBancaria;
import servicio.CuentaBancariaServicio;

public class Main {

    public static void main(String[] args) {
       
       CuentaBancariaServicio cb = new CuentaBancariaServicio();
       CuentaBancaria cuenta1 = cb.crearCuenta();
       cb.ingresar(cuenta1);
       System.out.println(cuenta1.toString());
       cb.retirar(cuenta1);
       cb.extraccioRapida(cuenta1);
       cb.consultaSaldo(cuenta1);
       cb.consultaDatos(cuenta1);
       
       
    }
    
}
