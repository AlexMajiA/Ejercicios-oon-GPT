package org.example.Alumno;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class GestorEstudiantes {

    // Creo una lista de estudiantes
    private List<Estudiante>students;

    public GestorEstudiantes(List<Estudiante> students) {
        this.students = students;
    }

    //Calcular y mostrar la nota media de todos.
    public double notaMedia (){
    double suma = 0.0;

    for (Estudiante estudiante:students){
        suma += estudiante.getAverageGrade();
    }
    double totalEstudiantes = students.size();

    double resultado = suma / totalEstudiantes;

        System.out.println("La nota media general es: " + resultado);

        return resultado;
    }

    // Objetivo: Recorrer la lista de estudiantes, comparar sus notas medias y devolver
    // el estudiante que tenga la mejor nota.

    public double mejorNota(){

        //declaro variables.
        Estudiante mejor = students.get(0);
        double mejorNota = mejor.getAverageGrade();


        for (Estudiante mejorAlumno : students){
            
           if (mejorAlumno.getAverageGrade() > mejorNota){
               mejorNota = mejorAlumno.getAverageGrade();
                mejor = mejorAlumno;
           }
        }

        System.out.println("El mejor alumno es: \n" + mejor.showInfo());
        return mejorNota;
    }

    // Mostrar los estudiantes que tengan una nota mayor o igual a 8.5

    public void bestStudent () {

        System.out.println("Estudiantes con media superior a 8.6:");
        students.stream()
                .filter(estudiante -> estudiante.getAverageGrade() >= 8.6)
                .forEach(estudiante -> System.out.println(estudiante.showInfo()));
    }

    // Convertir las notas de los estudiantes en calificaciones con letras.

    public void notasConLetras(){

        System.out.println("Conversión de notas en letras:");

        students.stream()
                .map(estudiante -> {
                    if (estudiante.getAverageGrade() >= 8){
                        String name = estudiante.getName();
                        return name + ": " + "A";
                    }else if (estudiante.getAverageGrade() >= 7) {
                        String name = estudiante.getName();
                        return name + ": " +"B";
                    } else if (estudiante.getAverageGrade() >= 5) {
                        String name = estudiante.getName();
                        return name + ": " +"C";
                    }else {
                        String name = estudiante.getName();
                        return name + ": " + "F";
                    }
                })
                .forEach(calificacion -> System.out.println( calificacion));

    }

}
