package org.example.model;

import org.example.service.CourseRegistration;
import org.example.service.DepartmentRegistration;
import org.example.service.StudentRegistration;

import java.util.List;

public class Registrar {
    private StudentRegistration SRegistration;
    private CourseRegistration CRegistration;
    private DepartmentRegistration DRegistration;

    public Registrar(StudentRegistration SRegistration, CourseRegistration CRegistration, DepartmentRegistration DRegistration){
        this.SRegistration = SRegistration;
        this.CRegistration = CRegistration;
        this.DRegistration = DRegistration;
    }

    // ---- STUDENT ----------------------------------------------------------------------------------------
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

    // ---- COURSE ----------------------------------------------------------------------------------------
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
        return "Successfully removed course!";
    }

    // ---- DEPARTMENT ----------------------------------------------------------------------------------------
    public String saveDepartment(String id, String name, List<Instructor> instructorList){
        DRegistration.saveDepartment(id,name, instructorList);
        return "Successfully added Department!";
    }
    public void displayAllDep(){
        System.out.println(DRegistration.displayAllDep());
    }
    public void updateDepartment(String id) {
        DRegistration.updateDepartment(id);
    }
    public String removeDepartment(String id) {
        return DRegistration.removeDepartment(id);
    }

//    List<Instructor> instructorList = new ArrayList<>();
//    Instructor instructor1 = new Instructor(777, "hi");
//    instructorList.add(instructor1);
}
