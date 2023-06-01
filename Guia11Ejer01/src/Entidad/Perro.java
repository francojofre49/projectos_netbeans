/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enumeracion.sexoAnimal;
import Enumeracion.tamanioPerro;

/**
 *
 * @author frank
 */
public class Perro {
     private String nombre;
    private String raza;
    private Integer edad;
    private sexoAnimal sexo;
    private tamanioPerro tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, sexoAnimal sexo, tamanioPerro tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.tamanio = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public sexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(sexoAnimal sexo) {
        this.sexo = sexo;
    }

    public tamanioPerro getTamaño() {
        return tamanio;
    }

    public void setTamaño(tamanioPerro tamaño) {
        this.tamanio = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", sexo=" + sexo + ", tamaño=" + tamanio + '}';
    }
    
    
    
}
