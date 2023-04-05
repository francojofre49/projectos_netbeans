/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y 
luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a  e  i  o  u
@  # $ % *


Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice  
la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package subprocesoejemplo1;
 import java.util.Scanner;
/**
 *
 * @author frank
 */
public class SubprocesoEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in); 
         
         String frase;
         
         int longitud;
         
         System.out.println("Ingrese una frase a codificar terminada en punto");
         frase= leer.next();
         
         longitud= frase.length()-1;
        
        System.out.println( mensajeCodificado(frase,longitud));
        
    }
    
    public static String  mensajeCodificado( String frase, int longitud){
   String fraseCod="";
   String letra;
       frase=frase.toLowerCase();
       
      for(int i=0;i<=longitud; i++){
       letra= frase.substring(i, i+1);
          switch (letra) {
              case "a":
                     fraseCod = fraseCod.concat("@");
                  break;
             case "e":
                      fraseCod =  fraseCod.concat("#");
                     break;
             case "i":
                     fraseCod =  fraseCod.concat("$");
                   break;
             case "o":
                         fraseCod =  fraseCod.concat("&");
                    break;
              case "u":
                         fraseCod =   fraseCod.concat("*");
                     break;
                  
              default:
                 fraseCod = fraseCod.concat(letra);
          }
       
      } 
      
    return fraseCod;
    
    }
}
