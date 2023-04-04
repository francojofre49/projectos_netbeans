/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control;

import java.util.Scanner;
 
public class EstructuraDeControl {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int num1;
   int num2;
    
        System.out.println("Ingrese dos numeros enteros");
        Scanner num = new Scanner(System.in);
        num1= num.nextInt();
        num2=num.nextInt();
        
        if(num1 > 25 || num2 >25 ){
            System.out.println("Uno o ambos numeros son mayor a 25");
        }
        
    }
  
}
