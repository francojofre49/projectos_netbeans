package Main;

import Entidades.Electro;
import Entidades.LavadoraService;
import Entidades.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electro> Lista = new ArrayList<Electro>();
        LavadoraService lav = new LavadoraService();
        TelevisorService tv = new TelevisorService();
        int op = 0;
        while (op != 7) {
            System.out.println("<<<<< MENÚ >>>>>");
            System.out.println("1.Crear Lavadora");
            System.out.println("2.Crear TV");
            System.out.println("3.Precio Final de Lavadora");
            System.out.println("4.Precio Final de TV");
            System.out.println("5.Mostrar Cantidad de Productos");
            System.out.println("6.Precio total de los productos");
            System.out.println("7.Salir Programa");
            System.out.print("Ingrese una opción: ");
            op = s.nextInt();
            System.out.println();
            switch (op) {
                case 1:
                    lav.CrearLavadora();
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 2:
                    tv.CrearTelevisor();
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 3:
                    lav.PrecioLav();
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 4:
                    tv.PrecioTv();
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 5:
                    Lista.add(lav);
                    Lista.add(tv);
                    for (Electro electro : Lista) {
                        System.out.println(electro);
                    }
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 6:
                    double cont = 0;
                    Lista.add(lav);
                    Lista.add(tv);
                    for (int i = 0; i < Lista.size(); i++) {
                        cont += Lista.get(i).getPrecio();
                    }
                    System.out.println("El precio total de los productos es: " + cont);
                    System.out.println("Ingrese nuevamente una opción");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Programa Finalizado");
                    break;
                default:
            }
        }
    }
}
