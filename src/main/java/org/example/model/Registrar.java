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
    public void addInstructor(Instructor instructor) {
        IRegistration.addInstructor(instructor);
    }
    public void assignInstructorToSection(Instructor instructor, Section section) {
        IRegistration.assignInstructorToSection(instructor, section);
    }
    public void getInstructorDetails(int id) {
        IRegistration.getInstructorDetails(id);
    }
    public Section findSection(String sectionName) {
        return DRegistration.findSection(sectionName);
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
