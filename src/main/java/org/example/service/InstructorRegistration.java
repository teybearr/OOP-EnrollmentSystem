package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;

public interface InstructorRegistration {
//    void saveInstructor(Instructor instructor);
//    void displayAllInstructor();
//    void updateInstructor(Instructor instructor);
//    String removeInstructor(Instructor instructor);

    void addInstructor(Instructor instructor);
    void assignInstructorToSection(Instructor instructor, Section section);
    void getInstructorDetails(int id);
}
