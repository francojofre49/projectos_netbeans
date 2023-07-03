package Entidades;

public class Televisor extends Electro{
    
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, String color, char consumo, double precio, int peso) {
        super(color, consumo, precio, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

     public boolean getSintonizador() {
        return sintonizador;
    }
    
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", Sintonizador=" + sintonizador + '}';
    }

}