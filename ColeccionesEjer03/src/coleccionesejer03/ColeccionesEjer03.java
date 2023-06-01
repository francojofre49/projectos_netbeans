/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer03;

import coleccionesejer03.entidad.Alumno;
import coleccionesejer03.servicio.ServicioAlumno;
import java.util.ArrayList;

/**
 *
 * @author frank
 */
public class ColeccionesEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServicioAlumno sa=new ServicioAlumno();
        ArrayList <Alumno> listaAlumnos= new ArrayList();
                sa.crearAlumnos(listaAlumnos);
       sa.notaFinal(listaAlumnos);

        
    }
    
}
