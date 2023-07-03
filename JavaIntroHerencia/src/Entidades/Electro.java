package Entidades;

import java.util.Scanner;

public abstract class Electro {

    protected String color;
    protected char consumo;
    protected double precio;
    protected int peso;
    private Scanner s = new Scanner(System.in).useDelimiter("\n");

    public Electro() {
        this.precio = 1000;
    }

    public Electro(String color, char consumo, double precio, int peso) {
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void ComprobarColor() {
        System.out.print("Ingrese el color del electrodoméstico(blanco, negro, rojo, azul): ");
        color = s.next();
       if(!color.equals("BLANCO") || !color.equals("blanco") || !color.equals("NEGRO") || !color.equals("negro") || !color.equals("ROJO") || !color.equals("rojo") || !color.equals("AZUL") || !color.equals("azul")){
            color = "blanco";
        }
    }

    public void ComprobarConsumo() {
        System.out.print("Ingrese el tipo de consumo del electrodoméstico(A, B, C, D, E, F): ");
        consumo = s.next().charAt(0);
        consumo=Character.toUpperCase(consumo);
        switch (consumo) {
            case 'A' :
                precio = 1000;
            case 'B':
                precio = 1800;
            case 'C':
                precio = 600;
            case 'D':
                precio = 500;
            case 'E':
                precio = 300;
            case 'F':
                precio = 100;
            default:
                precio = 100;
        }
        System.out.println("");
    }

        public void PrecioFinal() {
         if (consumo == 'A') {
            precio += 1000;
        }
        if (consumo == 'B') {
            precio += 800;
        }
        if (consumo == 'C') {
            precio += 600;
        }
        if (consumo == 'D') {
            precio += 500;
        }
        if (consumo == 'E') {
            precio += 300;
        }
        if (consumo == 'F') {
            precio += 100;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso > 80) {
            precio += 1000;
        }
        setPrecio(precio);
    }
    
    public void CrearElectrodomestico() {
        System.out.print("Ingrese el peso del electrodoméstico: ");
        peso = s.nextInt();
        ComprobarColor();
        ComprobarConsumo();
        PrecioFinal();
    }

    @Override
    public String toString() {
        return "Electro{" + "color=" + color + ", consumo=" + consumo + ", precio=" + precio + ", peso=" + peso + '}';
    }

}
