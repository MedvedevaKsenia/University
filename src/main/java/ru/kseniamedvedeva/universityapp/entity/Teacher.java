package ru.kseniamedvedeva.universityapp.entity;

public class Teacher implements Educative, Lively {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public void educate() {
        System.out.println("Teacher " + name + " learns student");
    }

    @Override
    public void sleep() {
        System.out.println("Teacher " + name + " sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Teacher " + name + " eats");
    }

    @Override
    public void learn() {
        System.out.println("Teacher " + name + " learns too");
    }
}
