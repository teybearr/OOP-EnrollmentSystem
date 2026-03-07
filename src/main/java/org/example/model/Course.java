package org.example.model;

public class Course extends Person {
    private String courseProgram;

    public Course(){}

    public Course(int id){
        super(id);
    }

    public Course (int id, String name, String courseProgram){
        super(id, name);
        this.courseProgram = courseProgram;
    }

    public String getCourseProgram() {
        return courseProgram;
    }
    public void setCourseProgram(String courseProgram) {
        this.courseProgram = courseProgram;
    }

    public void displayCourse() {
        System.out.println("\nCourse ID: " + getID());
        System.out.println("Course Name: " + getName());
        System.out.println("Course Program: " + getCourseProgram());
    }

    @Override
    public String toString() {
        return "Course {" +
                "ID = '" + getID() + "' | " +
                "Name = '" + getName() + "' | " +
                "Program: '" + courseProgram + "'}";
    }
}
