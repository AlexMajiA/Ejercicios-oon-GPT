package org.example;

import org.example.Alumno.Estudiante;
import org.example.Alumno.GestorEstudiantes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> students = new ArrayList<>();

        // Creo estudiantes por parámetros
        Estudiante student1 = new Estudiante(8.5,"Alejandro",40);
        Estudiante student2 = new Estudiante(8.6,"Silvia", 35);
        Estudiante student3 = new Estudiante(8.5,"Nathan", 20);
        Estudiante student4 = new Estudiante(5,"Barbara", 30);
        Estudiante student5 = new Estudiante(6.4,"Antonio", 70);
        Estudiante student6 = new Estudiante(6.8,"Francisca", 65);
        Estudiante student7 = new Estudiante(9.2,"Daniel", 1);

        // Añado estudiantes al ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        // Recorro el ArrayList para imprimir sus valores.
        for (Estudiante estudiante : students){
            System.out.println(estudiante.showInfo());
        }

        GestorEstudiantes gestor = new GestorEstudiantes(students);

        gestor.notaMedia();

        gestor.mejorNota();

        gestor.bestStudent();

    }
}