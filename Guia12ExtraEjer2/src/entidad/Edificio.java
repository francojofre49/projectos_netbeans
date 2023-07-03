/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author frank
 */
 public abstract class Edificio {

    protected double ancho;
    protected double largo;
    protected double alto;
    
    
    

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }
    
    //    • Método calcularSuperficie(): calcula la superficie del edificio.
//• Método calcularVolumen(): calcula el volumen del edifico.

    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();

}
