package org.example.service;

import org.example.model.Student;
import org.example.model.DupliStudIDExc;

public interface StudentRegistration {
    void saveStudent(Student student) throws DupliStudIDExc;
    void displayAllStudent();
    void updateStudent(Student student);
    String removeStudent(Student student);
}
