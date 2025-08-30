package org.example.Alumno;

import java.time.LocalDate;
import java.util.List;

public class Estudiante {

    // Atributos
    private String name;
    private int age;
    private double averageGrade;
    private String email;
    private boolean matriculado;
    private LocalDate birthday;
    private List<String>subjects;

    // Constructores


    public Estudiante() {
    }

    public Estudiante(String name, int age, double averageGrade, String email, boolean matriculado, LocalDate birthday, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
        this.email = email;
        this.matriculado = matriculado;
        this.birthday = birthday;
        this.subjects = subjects;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    // Metodo para mostrar información
    public String showInfo(){
        return  "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Midle note: " + this.averageGrade + "\n" +
                "email: " + this.email + "\n" +
                "Matriculado: " + this.matriculado + "\n" +
                "birthday: " + this.birthday + "\n" +
                "subjects: " +this.subjects + "\n";
    }
}
