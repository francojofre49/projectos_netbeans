/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Lavadora extends Electrodomestico {
    
   protected  double carga;

    public Lavadora() {
        
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

 
    
//    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + " carga " + carga;
    }
    
 


       
       

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------Cargar Lavadora--------------------");
  


 
        crearElectrodomestico();
     
        System.out.println("Ingresar carga de la lavadora");
        carga=leer.nextDouble();
            precioFinal();


        System.out.println(toString());
       
        


    }

    
    
//    public void precioFinal(Lavadora lav) {
//
//        if (lav.getCarga() > 30) {
//            lav.setPrecio(lav.getPrecio() + 500);
//
//        }

//    }

    @Override
    public void precioFinal() {
        super.precioFinal();
     if (carga > 30) {
       precio+= 500;
        
        
    }
    
    
}
}