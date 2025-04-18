package org.example.Alumno;

public class Estudiante {

    // Atributos
    private String name;
    private int age;
    private double averageGrade;

    // Constructores
    public Estudiante() {

    }

    public Estudiante(double averageGrade, String name, int age) {
        this.averageGrade = averageGrade;
        this.name = name;
        this.age = age;
    }

    // Getter y setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Metodo para mostrar información
    public String showInfo(){
        return "Name: " + this.name + "\n" +
               "Age: " + this.age + "\n" +
               "Midle note: " + this.averageGrade + "\n";
    }
}
