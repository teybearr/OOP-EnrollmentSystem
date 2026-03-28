package org.example.model;

import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

public class Registrar {
    private StudentRegistration SRegistration;
    private CourseRegistration CRegistration;

    public Registrar(StudentRegistration SRegistration, CourseRegistration CRegistration){
        this.SRegistration = SRegistration;
        this.CRegistration = CRegistration;
    }

    public String saveStudent(Student student){
        SRegistration.saveStudent(student);
        return "Successfully added student!";
    }
    public void displayAllStudent(){
        SRegistration.displayAllStudent();
    }
    public void updateStudent(Student student){
        SRegistration.updateStudent(student);
    }
    public String removeStudent(Student student){
        SRegistration.removeStudent(student);
        return "Successfully removed student!";
    }

    public String save(Course course){
        CRegistration.save(course);
        return "Successfully added course!";
    }
    public void displayAll(){
        CRegistration.displayAll();
    }
    public void updateCourse(Course course){
        CRegistration.updateCourse(course);
    }
    public String removeCourse(Course course){
        CRegistration.removeCourse(course);
        return "Successfully removed student!";
    }
}
