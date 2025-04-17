package org.example.Alumno;

public class Estudiante {

    private String name;
    private int age;
    private double averageGrade;

    public Estudiante() {

    }

    public Estudiante(double midleNote, String name, int age) {
        this.averageGrade = midleNote;
        this.name = name;
        this.age = age;
    }

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

    public String showInfo(){
        return "My name is: " + this.name + "\n" +
               "My age is: " + this.age + "\n" +
               "My midle note is: " + this.averageGrade + "\n";
    }
}
