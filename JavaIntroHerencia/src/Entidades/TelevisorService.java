package Entidades;

import java.util.Scanner;

public class TelevisorService extends Televisor{
    
     Scanner s = new Scanner(System.in).useDelimiter("\n");
    
        public Televisor CrearTelevisor() {
        super.CrearElectrodomestico();
        System.out.print("Ingrese la cantidad de pulgadas del televisor: ");
        int pulgadas = s.nextInt();
        setResolucion(pulgadas);
        int p = getResolucion();
            System.out.print("El televisor posee sintonizador? ");
            String resp = s.next();
            if(resp.equals("Si")|| resp.equals("si") || resp.equals("s")){
                setSintonizador(true);
            } else {
                setSintonizador(false);
            }
        boolean tdt = getSintonizador();
        return new Televisor(p,tdt, color, consumo, precio, peso);
    }

    public double PrecioTv(){
        super.PrecioFinal();
        double pre = getPrecio();
        double price = 0;
        boolean estado = isSintonizador();
        if(super.getResolucion() > 40){
            price = super.getPrecio() * 0.30;
            super.setPrecio(super.getPrecio() + price);
        } 
        if(super.isSintonizador() == true){
            super.setPrecio(super.getPrecio() + 500);
        }
        System.out.println("El precio Final del Producto es: " + super.getPrecio());
        return super.getPrecio();
    }
    
}
