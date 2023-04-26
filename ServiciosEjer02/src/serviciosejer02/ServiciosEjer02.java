/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosejer02;

import serviciosejer02.Entidad.Cafetera;
import serviciosejer02.Servicios.ServicioCafetera;

/**
 *
 * @author frank
 */
public class ServiciosEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioCafetera sc =new ServicioCafetera();
        Cafetera c1= sc.llenarCafetera();
        
        sc.servirTaza(c1);
        sc.vaciarCafetera(c1);
        sc.agregarCafe(c1);
        
        
        System.out.println(c1.toString());
    }
    
    
    
}
