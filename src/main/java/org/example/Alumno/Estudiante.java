package org.example.Alumno;

public class Estudiante {

    private String name = "Alejandro";
    private int age = 40;
    private double midleNote = 8.5;

    public Estudiante() {

    }

    public Estudiante(double midleNote, String name, int age) {
        this.midleNote = midleNote;
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

    public double getMidleNote() {
        return midleNote;
    }

    public void setMidleNote(double midleNote) {
        this.midleNote = midleNote;
    }

    public void showInfo(){
        System.out.println("My name is: " + this.name);
        System.out.println("My age is: " + this.age);
        System.out.println("My midle note is: " + this.midleNote);

    }
}
