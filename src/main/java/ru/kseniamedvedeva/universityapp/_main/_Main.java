package ru.kseniamedvedeva.universityapp._main;

import ru.kseniamedvedeva.universityapp.entity.*;

public class _Main {
    public static void main(String[] args) {
        String nameStudent = "Max";
        String nameTeacher = "Terry";
        String nameUniversity = "UrFU";

        University university = new University();
        Teacher teacher = new Teacher(nameTeacher);
        Student student = new Student(nameStudent);


        student.laze();
        teacher.SetName(nameTeacher);
        teacher.learn();
        teacher.eat();

        Educative educative = new Teacher(nameTeacher);
        educative.educate();

        Lazily lazily = new Student(nameStudent);
        lazily.laze();

        Lively lively = new Teacher(nameTeacher);
        lively.eat();
        lively = new Student(nameStudent);
        lively.sleep();

    }
}
