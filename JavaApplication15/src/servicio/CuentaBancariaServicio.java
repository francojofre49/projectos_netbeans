/*
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no 
tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    public Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Ingrese numero de Cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI cliente:");
        cuenta1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese Saldo: ");
        cuenta1.setSaldoActual(leer.nextDouble());
        return cuenta1;

    }

    public void ingresar(CuentaBancaria cuenta1) {
        System.out.println("Ingrese el Dinero a Depositar: ");
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + leer.nextDouble());

    }

    public void retirar(CuentaBancaria cuenta1) {
        String resp;
        do {
        System.out.println("Ingrese monto a retirar: ");
        double mto = 0;
        mto = leer.nextDouble();
        
            if (mto <= cuenta1.getSaldoActual()) {
                cuenta1.setSaldoActual(cuenta1.getSaldoActual() - mto);
            } else {
                System.out.println("Monto no valido: ");
            }

            System.out.println("Desea Retirar nuevamente: (S/N)");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

    }
}


