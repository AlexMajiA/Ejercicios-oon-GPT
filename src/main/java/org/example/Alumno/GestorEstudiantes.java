package org.example.Alumno;

import java.util.List;

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
        Estudiante mejor = null;
        double mejorNota = -1;
        double alumno;

        for (Estudiante mejorAlumno : students){

           if (mejorAlumno.getAverageGrade() > mejorNota){
               mejorNota = mejorAlumno.getAverageGrade();
                mejor = mejorAlumno;
           }
        }
        if (mejor != null){
            System.out.println("El mejor alumno es: \n" + mejor.showInfo());
        }

        return mejorNota;
    }






}
