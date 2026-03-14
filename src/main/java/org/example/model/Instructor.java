package org.example.model;

public class Instructor extends Person{

    @Override
    public void mainTask() {
        System.out.println("Teaching...");
    }

    Course course = new Course();
}