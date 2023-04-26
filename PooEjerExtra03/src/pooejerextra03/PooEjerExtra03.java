/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerextra03;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class PooEjerExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resp;
        
        Juego juego =new Juego();
        do{
       
        Scanner leer = new Scanner(System.in);
        System.out.println("J1-Ingresar numero a adivinar: ");
        juego.setNumA(leer.nextInt());
        System.out.println("J1-Ingresar cantidad de intentos: ");
        juego.setCantInt(leer.nextInt());
        
        juego.adivinar();
        juego.estadisticas();
        
            System.out.println("Desea seguir jugando(s/n)?");
            resp=leer.next();
        }while(resp.equals("s"));
        
        System.out.println("Saliendo del juego-....");
    }
    
}
