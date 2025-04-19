package org.example.Alumno;

import java.util.List;
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

    // Mostrar los estudiantes que tengan una nota mayor o igual a 7.5

    public void bestStudent () {

        System.out.println("Estudiantes con media superior a 7:");
        students.stream()
                .filter(estudiante -> estudiante.getAverageGrade() >= 7)
                .forEach(estudiante -> System.out.println(estudiante.showInfo()));
    }

}
