package Entidades;

public class Lavadora extends Electro{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, char consumoEnerg, double precio, int peso) {
        super(color, consumoEnerg, precio, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
     
}
