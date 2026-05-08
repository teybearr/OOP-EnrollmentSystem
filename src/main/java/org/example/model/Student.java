package org.example.model;

public class Student extends Person {
    private String program;

    // constructors
    public Student(){}
    public Student(int id){
        super(id);
    }
    public Student(int id, String name, String program) {
        super(id, name);
        this.program = program;
    }

    // section program getters & setters
    public String getProgram () {
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }

    @Override
    public void mainTask() {
        System.out.println("Studying...");
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID = '" + getID() + "' | " +
                "Name = '" + getName() + "' | " +
                "Program = '" + program + "'}";
    }
}