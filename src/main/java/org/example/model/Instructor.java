package org.example.model;

public class Instructor extends Person{

    Course course = new Course();

    @Override
    public void mainTask() {
        System.out.println("Teaching...");
    }
}
