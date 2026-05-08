package org.example.model;

import java.util.ArrayList;

public class Section {
    private String sectionName;
    private int maxCapacity;
    private ArrayList<Student> enrolledStuds;
    private Instructor instructor;

    // constructors
    public Section (String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.enrolledStuds = new ArrayList<>();
    }
    public Section (String sectionName, int maxCapacity, Instructor instructor) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.enrolledStuds = new ArrayList<>();
        this.instructor = instructor;
    }

    // section name getters & setters
    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    // section max capacity getters & setters
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    // section students getters & setters
    public ArrayList<Student> getEnrolledStuds() {
        return enrolledStuds;
    }
    public void setEnrolledStuds(ArrayList<Student> enrolledStuds) {
        this.enrolledStuds = enrolledStuds;
    }

    // section instructor getters & setters
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Section {" +
                "Section = '" + sectionName + "' | " +
                "Capacity = '" + maxCapacity + "' | " +
                "Enrolled = '" + enrolledStuds.size() + "' | " +
                "Instructor = '" + instructor +  "'}";
    }
}
