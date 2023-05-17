/*
uego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades


 */
package guia9extra02.Servicios;

import guia9extra02.Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class AhorcadoService {
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
      

        System.out.println("Ingresar una palabra: ");
       String frase=leer.next();
        System.out.println("Ingresar cantidad de jugadas maximas");
    int cant=leer.nextInt();
        int tamanio =frase.length();
        String[] vector = new String[tamanio];
        for (int i = 0; i < tamanio; i++) {
            vector[i] = frase.substring(i, i + 1);

        }
   
  Ahorcado a =new Ahorcado(vector, frase, cant, tamanio );
        
        return  a;

    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    public void longitud(Ahorcado a) {
        int b= a.getFrase().length();
        System.out.println("La longitud de la palabra es:" +b);

    }

//    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public int buscar(String letra,Ahorcado a) {

        int cont = 0;
        for (int i = 0; i < a.getFrase().length(); i++) {
            if (a.getVector()[i].equalsIgnoreCase(letra)) {
                cont++;
       
            }
        }
        if (cont == 0) {
            System.err.println("La letra " + letra + " no se encontro en la frase");
        } else {
            System.out.println("La letra " + letra + "  se encontro en la frase");
        }
return cont;
    }
    
    
//    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    
    public boolean encontradas(String letra, Ahorcado a, int aciertos){
    int encontradas= buscar(letra,a);
        System.out.println("Número de letras (encontradas, faltantes): ("+aciertos+","+(a.getFrase().length()-aciertos)+ ")" );
        
    return buscar(letra,a)>0;
    
    }
    
    
//    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado a){
        System.out.println("Le quedan: "+a.getJugadasMaximas()+ " intentos");
    
    
    }
    
    public void juego(Ahorcado a){
    boolean encontrar;
      int aciertos = 0;
       String letra ;
    longitud(a);
        System.out.println("---------------------------------------------------");
       int cont = 0;
         String[] are = new String[27];
        do{
            
       
        boolean band = false;
        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
           if (cont == 0) {
                are[cont] = letra;
                band=true;
                cont++;
            } else {

      for (int i = 0; i < cont; i++) {
                    if (are[i].equalsIgnoreCase(letra)) {
                        band=false;
                      
                  
                    }else{
                    are[cont]=letra;
                    band=true;
                    cont++;
                    break;
                    }
                }
              
            }
            
            
        } while (!band);
        
   
 aciertos=aciertos+ buscar(letra,a);
        
   encontrar=  encontradas(letra,a,aciertos);
   if (!encontrar){
   a.setJugadasMaximas(a.getJugadasMaximas()-1);
      }
   intentos(a);
        }while(a.getJugadasMaximas()>=0 && aciertos!=a.getFrase().length() );
    
        if (aciertos==a.getFrase().length()){
        
            System.out.println("Ganaste");
                }else
        {System.out.println("Perdiste");}
    }
    
    
}
