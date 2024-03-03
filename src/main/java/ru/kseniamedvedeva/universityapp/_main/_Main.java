package ru.kseniamedvedeva.universityapp._main;

import ru.kseniamedvedeva.universityapp.entity.*;

public class _Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        String nameStudent = "Max";
        String nameTeacher = "Terry";


        student.SetName(nameStudent);
        student.laze();
        teacher.SetName(nameTeacher);
        teacher.learn();
        teacher.eat();

        Educative educative = new Teacher();
        educative.educate();

        Lazily lazily = new Student();
        lazily.laze();

        Lively lively = new Teacher();
        lively.eat();
        lively = new Student();
        lively.sleep();

    }
}
