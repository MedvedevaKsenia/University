package ru.kseniamedvedeva.universityapp.entity;

public class Student implements Lively, Lazily {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

     @Override
    public void laze() {
        System.out.println(name + " is a student and he's lazy");
    }

    @Override
    public void learn() {
        System.out.println(name + " sometimes learns");
    }

    @Override
    public void sleep() {
        System.out.println(name + " rarely sleeps");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats snakes");
    }
}
