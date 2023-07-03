
package entidad;


public class Asiento {
    
    private String lugar;
    private boolean ocupado = false;

    public Asiento() {
    }

    public Asiento(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        String ocupado = " X |";
        if (this.ocupado) {
           return lugar + ocupado;
            
        } else{
           return lugar + "   |";
    }

   }
}
