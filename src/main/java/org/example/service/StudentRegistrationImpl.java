package org.example.service;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.model.Student;
import org.example.model.Section;
import org.example.model.FullSectionExc;
import org.example.model.DupliStudIDExc;

public class StudentRegistrationImpl implements StudentRegistration {
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Scanner jungkook = new Scanner (System.in);

    public void saveStudent (Student student) throws DupliStudIDExc {
        for (int i = 0; i < studentsList.size(); i++) {
            Student s = studentsList.get(i);
            if (s.getID() == student.getID()) {
                throw new DupliStudIDExc(student.getID() + "already exists.");
            }
        }
        studentsList.add(student);
        System.out.println("Successfully added!");
    }

    public void displayAllStudent(){
        System.out.println(studentsList);
    }

    public void updateStudent(Student student){
        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getID() == (student.getID())) {
                System.out.print("Enter new student name: ");
                String newName = jungkook.nextLine();
                System.out.print("Enter new program: ");
                String newProg = jungkook.nextLine();

                studentsList.set(i, new Student(student.getID(), newName, newProg));
                System.out.println("Successfully updated!");
                break;
            }
        }
    }

    public String removeStudent(Student student){
        for (int i = 0; i<studentsList.size(); i++){
            if (studentsList.get(i).getID() == (student.getID())){
                studentsList.remove(i);
                return "Successfully deleted!";
            }
        }
        return "Error";
    }

    public void enrollStudentToSection(Student student, Section section) throws FullSectionExc {
        if (section.getEnrolledStuds().size() >= section.getMaxCapacity()) {
            throw new FullSectionExc("Can't enroll: " + section.getSectionName() + "is full now...");
        }
        section.getEnrolledStuds().add(student);
        System.out.println("Successfully enrolled!");
    }
}
