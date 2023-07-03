/*

• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Electrodomestico {
//    
//    Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
    
    protected double precio=1000;
    protected String color;
    protected char consumoEnergia;
    protected double peso;

    public Electrodomestico() {
            this.precio=1000;
    }

    public Electrodomestico(double precio, String color, char consumoEnergia, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + '}';
    }
    
    public char comprobarCosumoElectrico(char letra) {
        letra = Character.toUpperCase(letra);
        if (!(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'E' || letra == 'F')) {
            return 'F';
        } else {

            return letra;
        }

    }

//    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
//    
    public String comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gruis")) {

            return color;

        } else {
            return "blanco";
        }

    }

//    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void crearElectrodomestico() {

       
        Scanner leer = new Scanner(System.in);

//   protected double precio;
//    protected String color;
//    protected char consumoEnergia;
//    protected double peso;    
//            
        System.out.println("--------------CARGANDO ELECTRODOMESTICO---------------------");

        System.out.println("Ingresar color (blanco/negro/rojo/azul/gris)");
        color =(comprobarColor(leer.next()));
        System.out.println("Ingresar consumo energetico(A/B/C/D/E/F)");
        consumoEnergia=comprobarCosumoElectrico(leer.next().charAt(0));
        System.out.println("Ingresar peso");
        peso=leer.nextDouble();
        precioFinal();

        System.out.println(toString());
 
        
    }

//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//    LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
    public void precioFinal() {

        switch (consumoEnergia) {
            case 'A':
                precio+= 1000;
                break;
            case 'B':
                precio+= 800;
                break;
            case 'C':
                precio+= 600;
                break;
            case 'D':
               precio+=  500;
                break;
            case 'E':
               precio+=  300;
                break;
            case 'F':
                precio+= 100;
                break;

        }

        if (peso >= 1 && peso< 20) {
             precio+= 100;
        } else if (peso >= 20 && peso< 50) {
            precio+=  500;
        } else if (peso>= 50 && peso < 80) {
             precio+=  800;

        } else if (peso > 80) {
              precio=+ 1000;

        }
    }
//    
    
}
