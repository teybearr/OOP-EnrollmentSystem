package org.example.model;

import org.example.service.CourseRegistration;
import org.example.service.DepartmentRegistration;
import org.example.service.InstructorRegistration;
import org.example.service.StudentRegistration;

import java.util.List;

public class Registrar {
    private StudentRegistration SRegistration;
    private CourseRegistration CRegistration;
    private InstructorRegistration IRegistration;
    private DepartmentRegistration DRegistration;

    // constructor
    public Registrar(StudentRegistration SRegistration, CourseRegistration CRegistration, InstructorRegistration IRegistration, DepartmentRegistration DRegistration){
        this.SRegistration = SRegistration;
        this.CRegistration = CRegistration;
        this.IRegistration = IRegistration;
        this.DRegistration = DRegistration;
    }

    // student
    public String saveStudent(Student student) throws DupliStudIDExc {
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
        return SRegistration.removeStudent(student);
    }

    // course
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
        return CRegistration.removeCourse(course);
    }

    // instructor
    public void saveInstructor(Instructor instructor) {
        IRegistration.saveInstructor(instructor);
    }
    public void displayAllInstructor() {
        IRegistration.displayAllInstructor();
    }
    public void updateInstructor(Instructor instructor) {
        IRegistration.updateInstructor(instructor);
    }
    public String removeInstructor(Instructor instructor) {
        return IRegistration.removeInstructor(instructor);
    }

//  department
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
    public void addSectiontoDept(String departmentId, Section section) {
        DRegistration.addSectiontoDept(departmentId, section);
    }
    public void displayHierarchy() {
        DRegistration.displayHierarchy();
    }
}
