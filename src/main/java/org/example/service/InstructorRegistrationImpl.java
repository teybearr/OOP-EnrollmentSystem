package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;

import java.util.ArrayList;
//import java.util.Scanner;

public class InstructorRegistrationImpl implements InstructorRegistration{
    private ArrayList<Instructor> instructorsList = new ArrayList<>();

    public void addInstructor(Instructor instructor) {
        instructorsList.add(instructor);
        System.out.println("Successfully added instructor!");
    }

    public void assignInstructorToSection(Instructor instructor, Section section) {
        section.setInstructor(instructor);
        System.out.println(instructor.getName() + "is successfully assigned to " + section.getSectionName());
    }

    public void getInstructorDetails(int id) {
        for (int i = 0; i < instructorsList.size(); i++) {
            Instructor inst = instructorsList.get(i);
            if (inst.getID() == id) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Instructor not found");
    }

    //private Scanner jungkook = new Scanner(System.in);

//    public void saveInstructor(Instructor instructor) {
//        instructorsList.add(instructor);
//        System.out.println("Successfully added!");
//    }
//    public void displayAllInstructor() {
//        System.out.println(instructorsList);
//    }
//    public void updateInstructor(Instructor instructor) {
//        for (int i = 0; i < instructorsList.size(); i++) {
//            if (instructorsList.get(i).getID() == instructor.getID()) {
//                System.out.print("Enter Instructor name: ");
//                String newName = jungkook.nextLine();
//                System.out.print("Enter handling course: ");
//                String newCourse = jungkook.nextLine();
//
//                instructorsList.set(i, new Instructor(instructor.getID(), newName, newCourse));
//                System.out.println("Successfully updated!");
//                return;
//            }
//        }
//        System.out.println("Instructor not found.");
//    }
//    public String removeInstructor(Instructor instructor) {
//        for (int i = 0; i < instructorsList.size(); i++) {
//            if (instructorsList.get(i).getID() == instructor.getID()) {
//                instructorsList.remove(i);
//                return "Successfully deleted!";
//            }
//        }
//        return "Instructor can't be found...";
//    }
}