package ru.kseniamedvedeva.universityapp.entity;

public class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }
}
