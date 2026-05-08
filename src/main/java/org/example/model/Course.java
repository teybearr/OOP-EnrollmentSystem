package org.example.model;

public class Course {
    private String courseID;
    private String courseName;
    private String courseProgram;

    // constructors
    public Course(){ }
    public Course(String courseID){ this.courseID = courseID; }
    public Course (String courseID, String courseName, String courseProgram){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
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

//    public void displayCourse() {
//        System.out.println("\nCourse ID: " + getCourseID());
//        System.out.println("Course Name: " + getCourseName());
//        System.out.println("Course Program: " + getCourseProgram());
//    }

    @Override
    public String toString() {
        return "Course {" +
                "ID = '" + courseID + "' | " +
                "Name = '" + courseName + "' | " +
                "Program = '" + courseProgram + "'}";
    }
}
