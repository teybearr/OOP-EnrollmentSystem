package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.studentRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner (System.in);

//        System.out.print("Enter Student ID: ");
//        String id = jungkook.nextLine();
//        System.out.print("Enter Student Name: ");
//        String name = jungkook.nextLine();
//        System.out.print("Enter Course ID: ");
//        String cID = jungkook.nextLine();
//        System.out.print("Enter Course Name: ");
//        String cName = jungkook.nextLine();
//        System.out.print("Enter Program: ");
//        String prog = jungkook.nextLine();

        studentRegistration registration = new studentRegistration();
        registration.saveStudent(new Student ("2024374071", "Quiatchon, A.", "BSIT"));
        registration.saveStudent(new Student ("1200014669", "Unknown", "Unknown"));
        registration.saveStudent(new Student ("2024777777", "Bogart", "BSM"));

        registration.displayAllStudent();

        registration.updateStudent(new Student("1200014669"));

        registration.removeStudent(new Student ("2024777777"));

        registration.displayAllStudent();

        Course c = new Course();
        c.setCourseID("INTEPROG");
        c.setCourseName("Integrative Programming and Technologies");
        c.setProgram("BSIT");
        c.displayCourse();
    }
}