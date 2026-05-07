package org.example.model;

import java.util.ArrayList;

public class Section {
    private String sectionName;
    private int maxCapacity;
    private ArrayList<Student> enrolledStuds;

    public Section (String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.enrolledStuds = new ArrayList<>();
    }

    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ArrayList<Student> getEnrolledStuds() {
        return enrolledStuds;
    }
    public void setEnrolledStuds(ArrayList<Student> enrolledStuds) {
        this.enrolledStuds = enrolledStuds;
    }

    @Override
    public String toString() {
        return "Section {" +
                "Section = '" + sectionName + "' | " +
                "Capacity = '" + maxCapacity + "' | " +
                "Enrolled = '" + enrolledStuds.size() + "'}";
    }
}
