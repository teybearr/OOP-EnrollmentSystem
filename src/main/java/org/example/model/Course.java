package org.example.model;

import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private String courseProgram;
    private int units;
    private ArrayList<Course> prerequisites;

    // constructors
    public Course(){
        this.prerequisites = new ArrayList<>();
    }
    public Course(String courseID){
        this.courseID = courseID;
        this.prerequisites = new ArrayList<>();
    }
    public Course (String courseID, String courseName, String courseProgram){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
        this.units = 0;
        this.prerequisites = new ArrayList<>();
    }
    public Course (String courseID, String courseName, String courseProgram, int units){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
        this.units = units;
        this.prerequisites = new ArrayList<>();
    }

    // course id getters & setters
    public String getCourseID (){
        return courseID;
    }
    public void setCourseID (String courseID){
        this.courseID = courseID;
    }

    // course name getters & setters
    public String getCourseName (){
        return courseName;
    }
    public void setCourseName (String courseName){
        this.courseName = courseName;
    }

    // course program getters & setters
    public String getCourseProgram() {
        return courseProgram;
    }
    public void setCourseProgram(String courseProgram) {
        this.courseProgram = courseProgram;
    }

    // units getters & setters
    public int getUnits() {
        return units;
    }
    public void setUnits(int units) {
        this.units = units;
    }

    // prerequisite getters & setters
    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }
    public void addPrerequisites(Course course) {
        prerequisites.add(course);
    }

    @Override
    public String toString() {
        return "Course {" +
                "ID = '" + courseID + "' | " +
                "Name = '" + courseName + "' | " +
                "Program = '" + courseProgram + "' | " +
                "Units = '" + units + "'}";
    }
}
