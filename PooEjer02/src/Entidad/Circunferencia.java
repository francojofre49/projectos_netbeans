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
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar radio");
        radio=leer.nextFloat();
        
    }
    public double area(){
    
        return Math.PI*Math.pow(radio, 2);
    
    }
    
    public double perimetro(){
    return 2*Math.PI*radio;
    
    }
    
}
