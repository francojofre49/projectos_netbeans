/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir.frase;

/**
 *
 * @author frank
 */
public class InvertirFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String  frase= "hola" ;
       int cont= frase.length()-1;
       String letra; 
       String frase2="";
        for (int i =frase.length(); i >0; i--) {
            
            letra=frase.substring(cont,i);
            System.out.println(letra);
            frase2=frase2.concat(letra);
            cont--;
            
        }
        System.out.println(frase2+ " frase 2");
    }
    
}
