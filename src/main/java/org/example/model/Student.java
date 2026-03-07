package org.example.model;

public class Student extends Person {
    private String program;

    public Student(){}

    public Student(int id){
        super(id);
    }

    public Student(int id, String name, String program) {
        super(id, name);
        this.program = program;
    }

    public String getProgram () {
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }

    public void displayStudent(){
        System.out.println("\nStudent ID: " + getID());
        System.out.println("Student Name: " + getName());
        System.out.println("Program: " + getProgram());
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID = '" + getID() + "' | " +
                "Name = '" + getName() + "' | " +
                "Program: '" + program + "'}";
    }
}
