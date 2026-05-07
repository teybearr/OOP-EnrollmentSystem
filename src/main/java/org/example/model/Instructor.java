package org.example.model;

import java.util.ArrayList;

public class Instructor extends Person{
    private String course;

    public Instructor(){
        super();
    }

    public Instructor(int instructorID){
        super(instructorID);
    }

    public Instructor(int instructorID, String instructorName){
        super(instructorID, instructorName);
    }
    public Instructor(int instructorID, String instructorName, String course){
        super(instructorID, instructorName);
        this.course = course;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public void mainTask() {
        System.out.println("Teaching...");
    }

    @Override
    public String toString() {
        return "Instructor {" +
                "ID = '" + getID() + "' | " +
                "Name = '" + getName() + "' | " +
                "Course: '" + course + "'}";
    }

}