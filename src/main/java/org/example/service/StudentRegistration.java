package org.example.service;

import org.example.model.Student;
import org.example.model.DupliStudIDExc;
import org.example.model.FullSectionExc;
import org.example.model.Section;

public interface StudentRegistration {
    void saveStudent(Student student) throws DupliStudIDExc;
    void displayAllStudent();
    void updateStudent(Student student);
    String removeStudent(Student student);
    void enrollStudentToSection(Student student, Section section) throws FullSectionExc;
    Student findStudent(int id);
}
