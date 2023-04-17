/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Circunferencia {
    
private float radio;
public float circunferencia;

//constructor
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getCircunferencia() {
        return circunferencia;
    }
    
    
  public  void crearCircunferencia(){
        
          Scanner leer = new Scanner(System.in);
          
            System.out.println("Ingrese radio");
            radio=leer.nextFloat();
   
    
    }
  public double area(){
    double area=(3.14*circunferencia);
    return sqrt(area);
    
}
  
  public double perimetro(){
  
  return 2*3.13*radio;
  
  }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", circunferencia=" + circunferencia + '}';
    }
     
     
     
}