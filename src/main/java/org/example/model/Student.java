package org.example.model;

public class Student extends Person {
    private String program;
    private String scholarshipType;

    // constructors
    public Student(){}
    public Student(int id){
        super(id);
        this.scholarshipType = "NONE";
    }
    public Student(int id, String name, String program) {
        super(id, name);
        this.program = program;
        this.scholarshipType = "NONE";
    }

    // section program getters & setters
    public String getProgram () {
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }

    // scholarship getters & setters
    public String getScholarshipType() {
        return scholarshipType;
    }
    public void setScholarshipType(String scholarshipType) {
        this.scholarshipType = scholarshipType;
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