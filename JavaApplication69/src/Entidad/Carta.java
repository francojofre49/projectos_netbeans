/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author frank
 */
public class Carta {
    
    private Integer valor;
    private String palo;

    public Carta(Integer valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta() {
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor+ " de "+ palo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    
    
}
