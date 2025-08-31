package org.example;

import org.example.Alumno.Estudiante;
import org.example.Alumno.GestorEstudiantes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> students = new ArrayList<>(Arrays.asList(
                new Estudiante("Alejandro", 41, 8.9, "alejandro@example.com", true, LocalDate.of(1984, 9, 16),
                        Arrays.asList("Matemáticas", "Física", "Informática")),
                new Estudiante("Silvia", 36, 8.1, "silvia@example.com", true, LocalDate.of(1989, 7, 31),
                        Arrays.asList("Historia", "Literatura", "Arte")),
                new Estudiante("Nathan", 19, 8.5, "nathan@example.com", true, LocalDate.of(2004, 3, 21),
                        Arrays.asList("Informática", "Matemáticas", "Química")),
                new Estudiante("Barbara", 30, 5.0, "barbara@example.com", false, LocalDate.of(1993, 11, 5),
                        Arrays.asList("Biología", "Química")),
                new Estudiante("Antonio", 71, 6.4, "antonio@example.com", true, LocalDate.of(1952, 2, 12),
                        Arrays.asList("Filosofía", "Historia")),
                new Estudiante("Francisca", 65, 6.8, "francisca@example.com", false, LocalDate.of(1958, 7, 30),
                        Arrays.asList("Matemáticas", "Arte")),
                new Estudiante("Daniel", 1, 9.2, "daniel@example.com", true, LocalDate.of(2024, 1, 1),
                        Arrays.asList("Educación Física")),
                new Estudiante("Jose", 32, 4.2, "jose@example.com", true, LocalDate.of(1991, 6, 18),
                        Arrays.asList("Informática", "Física")),
                new Estudiante("Veronica", 32, 6.9, "veronica@example.com", false, LocalDate.of(1991, 12, 22),
                        Arrays.asList("Literatura", "Historia")),
                new Estudiante("Lucía", 28, 7.5, "lucia@example.com", true, LocalDate.of(1995, 9, 9),
                        Arrays.asList("Química", "Biología")),
                new Estudiante("Marcos", 22, 9.8, "marcos@example.com", true, LocalDate.of(2001, 8, 3),
                        Arrays.asList("Matemáticas", "Informática", "Física")),
                new Estudiante("Isabel", 31, 3.4, "isabel@example.com", false, LocalDate.of(1992, 4, 14),
                        Arrays.asList("Arte", "Historia")),
                new Estudiante("Raúl", 27, 5.6, "raul@example.com", true, LocalDate.of(1996, 10, 7),
                        Arrays.asList("Matemáticas", "Física")),
                new Estudiante("Patricia", 24, 4.9, "patricia@example.com", false, LocalDate.of(1999, 2, 20),
                        Arrays.asList("Literatura", "Arte")),
                new Estudiante("Carmen", 29, 8.3, "carmen@example.com", true, LocalDate.of(1994, 5, 12),
                        Arrays.asList("Biología", "Química", "Matemáticas")),
                new Estudiante("Hugo", 33, 6.1, "hugo@example.com", true, LocalDate.of(1990, 11, 3),
                        Arrays.asList("Física", "Matemáticas")),
                new Estudiante("Sofía", 19, 2.7, "sofia@example.com", true, LocalDate.of(2004, 12, 25),
                        Arrays.asList("Informática", "Arte")),
                new Estudiante("Javier", 36, 7.0, "javier@example.com", true, LocalDate.of(1987, 8, 14),
                        Arrays.asList("Historia", "Filosofía")),
                new Estudiante("Elena", 25, 9.1, "elena@example.com", true, LocalDate.of(1998, 3, 9),
                        Arrays.asList("Matemáticas", "Informática", "Química"))
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

       // gestor.superiorIgualnueve();

       // gestor.onlyMatriculados();

        Optional<Estudiante> encontrado = gestor.findStudentByMail("marcos@example.com");
        if (encontrado.isPresent()){
            System.out.println(encontrado.get().showInfo());
        }else {
            System.out.println("Student not found");
        }



    }
}