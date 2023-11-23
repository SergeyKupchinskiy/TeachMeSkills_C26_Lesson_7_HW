package com.teachmeskills.lesson_7.Ex_1;

public class Worker implements IShow {
    String name;
    String surname;
    int salary;
    String workExperience;

    public Worker(String name, String surname, int salary, String workExperience) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    @Override
    public void showTitle() {
        System.out.println("Worker");
    }
}
