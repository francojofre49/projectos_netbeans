/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Operacion {

    private float num1;
    private float num2;

    public Operacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar num1");
        num1 = leer.nextFloat();
        System.out.println("Ingresar num2");
        num2 = leer.nextFloat();

    }

    public float sumar() {

        return num2 + num1;

    }

    public float restar() {

        return num2 - num1;

    }

    public float multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error culia");
            return 0;

        }
        return num1 * num2;

    }

    public float dividir() {
        if (num2 == 0) {
            System.out.println("Error culia");
            return 0;

        }
        return num1 / num2;

    }

}
