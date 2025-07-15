package org.example.Alumno;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.sort;


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

    //Ejercicio 4: Mostrar los estudiantes que tengan una nota mayor o igual a 8.6
    public void bestStudent () {

        System.out.println("Estudiantes con media superior a 8.6:");
        students.stream()
                .filter(estudiante -> estudiante.getAverageGrade() >= 8.6)
                .forEach(estudiante -> System.out.println(estudiante.showInfo()));
    }

    //Ejercicio 5: Convertir las notas de los estudiantes en calificaciones con letras.
    public void notasConLetras(){

        System.out.println("Conversión de notas en letras:");

        students.stream()
                .map(estudiante -> {
                    String name = estudiante.getName();
                    double grade = estudiante.getAverageGrade();

                    if ( grade>= 8){
                        return name + ": " + "A";
                    }else if (grade >= 7) {
                        return name + ": " +"B";
                    } else if (grade >= 5) {
                        return name + ": " +"C";
                    }else {
                        return name + ": " + "F";
                    }
                })
                .forEach(calificacion -> System.out.println( calificacion));
    }

    //Ejercicio 6:
    public void studentGreaterThan25(){

        System.out.println("Estudiantes mayores de 25 ordenados alfabéticamente:");

        students.stream()
                .filter(estudiante -> estudiante.getAge() >= 25)
                .map(Estudiante::getName)
                .sorted()
                .forEach(System.out::println);

    }

    //Ejercicio 7: Mostrar los estudiantes que tengan una nota inferior a 8.5
    public void normalStudent (){

        System.out.println("Estudiantes con media inferior o igual a 8.5");
        students.stream()
                .filter(estudiante -> estudiante.getAverageGrade() <= 8.5)
                .forEach(estudiante -> System.out.println(estudiante.showInfo()));
    }

    //Ejercicio 8: Muestra los estudiantes agrupados por su letra de calificación.
    public void agruparEstudiantesCalificacion (){

        System.out.println("Estudiantes agrupados por calificaciones por letras:");

        Map <String, List <Estudiante>> agrupados = students.stream()
                .collect(Collectors.groupingBy(estudiante ->{
            double grade = estudiante.getAverageGrade();

                if (grade >= 8){
                    return "A";

                } else if (grade >=7 ) {
                    return "B";

                } else if (grade >=5) {
                    return "C" ;

                } else  {
                    return "F";
                }
             }));

            agrupados.forEach((calificacion, lista)->{

                System.out.println("Nota media " + calificacion + ":");
                lista.forEach(est -> System.out.println("- " + est.getName()));
            });


    }

    //Ejercicio 9: Cuenta los estudiantes según su calificación obtenida.
    public void contadorCalificaciones() {

        Map <String, List<Estudiante>> agrupados = students.stream()
                .collect(Collectors.groupingBy(estudiante ->{
                            Double grade = estudiante.getAverageGrade();

                            if (grade >=8){
                                return "A";
                            } else if (grade >=7) {
                                return "B";
                            } else if (grade>=5) {
                                return "C";
                            }else {
                                return "F";
                            }
                }));

                agrupados.forEach((letra,lista)->{
                    System.out.println("Calificación " + letra + ": " + lista.size() + " estudiantes.");

        });
    }

    //Ejercicio 10: Imprimir solo los nombres de los estudiantes con nota media superior a 7, ordenados alfabéticamente
    public void orderStudentsByAsc(){

        //Creo la lista para guardar los nombres
        List<String> names = new ArrayList<>();

        //recorro la lista con la condición de que sea la nota >7
        for (Estudiante estudiante:students){
            if(estudiante.getAverageGrade()>7) {
                //obtengo el nombre y lo añado.
                String name = estudiante.getName();
                names.add(name);
            }
        }
        //Ordeno la lista alfabéticamente.
        sort(names);

        //Recorro los nombres para imprimirlos por separado.
        for (String name:names){
            System.out.println(name);
        }
    }

    //Ejercicio 11: Imprimir el nombre y la nota media del estudiante con mejor nota.
    public void bestStudent2(){

        double mejorNota = 1;
        Estudiante mejorEstudiante = null;

        for (Estudiante estudiante:students){

            if (estudiante.getAverageGrade() > mejorNota){
                mejorNota = estudiante.getAverageGrade();
                mejorEstudiante = estudiante;
            }
        }
        System.out.println("Mejor estudiante: " + mejorEstudiante.getName());
        System.out.println("Nota media: " + mejorEstudiante.getAverageGrade());

    }

    //Ejercicio 12: Imprimir el número de estudiantes que tienen una nota media superior a 7.
    public void studentSeven(){
        int contador = 0;
        for (Estudiante estudiante : students){
            if (estudiante.getAverageGrade()>7){
                contador++;
            }
        }
        System.out.println("El numero de estudiantes con nota superior a 7 es: " + contador);
    }

    //Ejercicio 13: Imprimir los datos del estudiante con la peor nota media.
    public void badStudent(){
       double peorNota = 10;
       Estudiante peorEstudiante = null;
        for (Estudiante estudiante : students){
            if (estudiante.getAverageGrade()<peorNota){
                peorNota = estudiante.getAverageGrade();
                peorEstudiante = estudiante;
            }
        }
        if (peorEstudiante != null){
            System.out.println(peorEstudiante.showInfo());
        }else{
            System.out.println("No hay estudiantes en la lista");
        }
    }


}
