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
}
