package org.example.model;

import java.util.List;

public class Department {
    private String id;
    private String name;
    private List<Instructor> instructorList;

    public Department (String id, String name, List<Instructor> instructorList){
        this.id = id;
        this.name = name;
        this.instructorList = instructorList;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }
    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    @Override
    public String toString() {
        return "Course {" +
                "ID = '" + id + "' | " +
                "Department Name = '" + name + "'}";
    }
}