package org.example.model;

import java.util.ArrayList;

public class Instructor extends Person{
    private String course;
    private String department;
    private ArrayList<Section> assignedSections;

    // constructor
    public Instructor(){
        super();
        this.assignedSections = new ArrayList<>();
    }
    public Instructor(int instructorID){
        super(instructorID);
        this.assignedSections = new ArrayList<>();
    }
    public Instructor(int instructorID, String instructorName){
        super(instructorID, instructorName);
        this.assignedSections = new ArrayList<>();
    }
    public Instructor(int instructorID, String instructorName, String course){
        super(instructorID, instructorName);
        this.course = course;
        this.assignedSections = new ArrayList<>();
    }
    public Instructor(int instructorID, String instructorName, String course, String department) {
        super(instructorID, instructorName);
        this.course = course;
        this.department = department;
        this.assignedSections = new ArrayList<>();
    }

    // course getters & setters
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    // department getters & setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // assigned sections getters & setters
    public ArrayList<Section> getAssignedSections() { return assignedSections; }
    public void addAssignedSection(Section section) { assignedSections.add(section); }

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