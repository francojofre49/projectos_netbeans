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
public class Televisor extends Electrodomestico {
    
    protected double pulgadas;
    protected boolean antenaTdt;
   public  Scanner leer = new Scanner(System.in);

    public Televisor() {
    }



    public Televisor(double pulgadas, boolean antenaTdt, double precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.pulgadas = pulgadas;
        this.antenaTdt = antenaTdt;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isAntenaTdt() {
        return antenaTdt;
    }

    public void setAntenaTdt(boolean antenaTdt) {
        this.antenaTdt = antenaTdt;
    }

    public void crearTelevisor(){
        System.out.println(" Cargar Televisor");
    crearElectrodomestico();
        System.out.println("ingresar resolucion del tv(pulgadas)");
        pulgadas=leer.nextDouble();
        System.out.println("Ingresar si tiene antena TDT(s/n)");
        
        
    
    
    
    }
    
    
    @Override
    public void precioFinal() {
        super.precioFinal(); 
    }
    
    
    
    
    
    
}
