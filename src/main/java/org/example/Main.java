package org.example;

import org.example.Alumno.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante alumn1 = new Estudiante();
        Estudiante alumn2 = new Estudiante(6.7,"Silvia", 36);

        alumn1.showInfo();
        System.out.println("-------------------------------");
        alumn2.showInfo();



    }
}