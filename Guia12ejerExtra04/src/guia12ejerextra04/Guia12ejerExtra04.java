/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejerextra04;

import entidad.Estudiante;
import entidad.PersonalDeServicio;
import entidad.Profesores;

/**
 *
 * @author frank
 */
public class Guia12ejerExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.crearEstudiante();
        Profesores p = new Profesores();
        p.crearProfesor();
        PersonalDeServicio ps = new PersonalDeServicio();
        ps.crearPersonal();
        System.out.println(e.toString());
        System.out.println(ps.toString());
        System.out.println(p.toString());

        e.cambiarEstadoCivil();
        p.cambiarEstadoCivil();
        ps.cambiarEstadoCivil();

        p.reasignarDespacho();
        ps.reasignarDespacho();

        e.matricular();

        p.cambioDepartamento();
        ps.TrasladoSeccion();
System.out.println(e.toString());
        System.out.println(ps.toString());
        System.out.println(p.toString());
    }

}
