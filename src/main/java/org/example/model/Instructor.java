package org.example.model;

import java.util.ArrayList;

public class Instructor extends Person{

    @Override
    public void mainTask() {
        System.out.println("Teaching...");
    }

    Course course = new Course();
    ArrayList<String> courses = new ArrayList<>();

}