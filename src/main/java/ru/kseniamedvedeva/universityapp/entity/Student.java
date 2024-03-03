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
        System.out.println("Student " + name + " laze");
    }

    @Override
    public void learn() {
        System.out.println("Student " + name + " sometimes learns");
    }

    @Override
    public void sleep() {
        System.out.println("Student " + name + " sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Student " + name + " eats snakes");
    }
}
