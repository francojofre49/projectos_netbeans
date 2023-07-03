
package servicio;

import entidad.Asiento;
import entidad.Cine;
import entidad.Persona;
import java.util.ArrayList;


//8 A X | 8 B X | 8 C X | 8 D    | 8 E X | 8 F X
//7 A X | 7 B X | 7 C X | 7 D X | 7 E    | 7 F X
//6 A X | 6 B X | 6 C    | 6 D X | 6 E X | 6 F
//5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
//4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
//3 A X | 3 B X | 3 C X | 3 D    | 3 E X | 3 F X
//2 A X | 2 B    | 2 C X | 2 D X | 2 E X | 2 F
//1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X

public class ServicioCine {
    
 
    
    public void llenarCineAsientos(Cine cine){
        
        Asiento[][] matrizxaux = new Asiento [8][6];
        for (int i = 7; i >= 0; i--) {
            
            for (int j = 0; j < 6; j++) {
                
           Asiento asiento = new Asiento();
                
                String nombre = String.valueOf(i+1);
                switch (j) {
                    
                    case 0:  nombre =nombre.concat(" A")  ;
                    
                        
                        break;
                    case 1:       nombre =nombre.concat(" B")  ;
                        break;
                        
                        case 2:       nombre =nombre.concat(" C")  ;
                        break;
                        case 3:        nombre =nombre.concat(" D")  ;
                        break;
                        
                        case 4:        nombre =nombre.concat(" E")  ;
                        break;
                        
                        case 5:       nombre = nombre.concat(" F")  ;
                        break;
                      
                }
               
//                int alazar  = (int)Math.floor(Math.random() * 2);
//             if(alazar == 1){
//                  asiento.setOcupado(true);
//             }
             
                 asiento.setLugar(nombre);
                 
                matrizxaux[i][j]= asiento;
                      
            }
                 System.out.println(" ");
        }
        
        cine.setSala(matrizxaux);
    }
    
    public void mostrarSala(Cine cine){
        Asiento[][] aux = cine.getSala();
        
        System.out.println("***************************************");
        System.out.println("***************PANTALLA****************");
        System.out.println("****************************************");
        System.out.println(" ");
        for (int i = 7; i >= 0; i--) {
            
            for (int j = 0; j < 6; j++) {
                
                System.out.print(aux[i][j]);
                
            }
            System.out.println(" ");
        }
        
    }
   
    public void cargarListaPersonas(Cine cine){
        System.out.println("Cargar lista personas***************");
        ArrayList<Persona> aux = new ArrayList();
        
        for (int i = 0; i < 25; i++) {
            
            Persona persona = new Persona();
            
            persona.setNombre(persona.getNombre().concat(String.valueOf(i+1)));
            persona.setEdad((int)Math.floor(Math.random() * 35) + 10);
            persona.setDinero((double)Math.floor(Math.random() * 150) + 50);
            aux.add(persona);
        }
        cine.setPersonas(aux);
        
        for (Persona persona : aux) {
            System.out.println(persona);
            
        }
        System.out.println("********************");
    }
    
   public void simulacionCine(Cine cine){
       System.out.println("*****************SIMULACION***********************");
       ArrayList<Persona> auxPersonas = cine.getPersonas();
       
       int siEntran = 0;
       
 
       
       for (Persona persona : auxPersonas) {
           if(persona.getDinero()>= 100 && persona.getEdad()>=16){
               
               siEntran++;
           }
     
       }
       System.out.println(" ");
       System.out.println("Entran al cine "+siEntran+ " Personas");
       System.out.println(" ");
       
       Asiento[][] auxAsiento = cine.getSala();
       
       for (int i = 0; i < siEntran; i++) {
           boolean sentado = true;
           int fila= (int)Math.floor(Math.random() * 8);
           int columna =(int)Math.floor(Math.random() * 6);
           
           do {
                     if(!(auxAsiento[fila][columna].isOcupado())){
                         auxAsiento[fila][columna].setOcupado(true);
                    sentado = false;
       } else{
                         fila= (int)Math.floor(Math.random() * 8);
                         columna =(int)Math.floor(Math.random() * 6);
                     }
               
           } while (sentado);
           
          
           
       }
     
         cine.setSala(auxAsiento);
       }
   }
    

