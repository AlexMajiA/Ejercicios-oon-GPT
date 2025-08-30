package org.example;

import org.example.Alumno.Estudiante;
import org.example.Alumno.GestorEstudiantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> students = new ArrayList<>(Arrays.asList(
                new Estudiante(8.9,"Alejandro",40),
                new Estudiante(8.1,"Silvia",35),
                new Estudiante(8.5,"Nathan",20),
                new Estudiante(5,"Barbara",30),
                new Estudiante(6.4,"Antonio",70),
                new Estudiante(6.8,"Francisca",65),
                new Estudiante(9.2,"Daniel",1),
                new Estudiante(4.2,"Jose",32),
                new Estudiante(6.9,"Veronica",32),
                new Estudiante(7.5,"Lucía",28),
                new Estudiante(9.8,"Marcos",22),
                new Estudiante(3.4,"Isabel",31),
                new Estudiante(5.6,"Raúl",27),
                new Estudiante(4.9,"Patricia",24),
                new Estudiante(8.3,"Carmen",29),
                new Estudiante(6.1,"Hugo",33),
                new Estudiante(2.7,"Sofía",19),
                new Estudiante(7.0,"Javier",36),
                new Estudiante(9.1,"Elena",25)
        ));

        GestorEstudiantes gestor = new GestorEstudiantes(students);

       // gestor.notaMedia();

       // gestor.mejorNota();

       // gestor.bestStudent();

       // gestor.notasConLetras();

       // gestor.studentGreaterThan25();

       // gestor.normalStudent();

       // gestor.agruparEstudiantesCalificacion();

       // gestor.contadorCalificaciones();

       // gestor.orderStudentsByAsc();

       // gestor.bestStudent2();

       // gestor.studentSeven();

       // gestor.badStudent();

       // gestor.promedioNotas();

       // gestor.inferiorCinco();

        gestor.superiorIgualnueve();


    }
}