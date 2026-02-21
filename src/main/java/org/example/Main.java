package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.courseRegistration;
import org.example.service.studentRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner (System.in);

//        System.out.print("Enter Student ID: ");
//        String id = jungkook.nextLine();
//        System.out.print("Enter Student Name: ");
//        String name = jungkook.nextLine();
//        System.out.println("Enter Program: ");
//        String program = jungkook.nextLine();
//        System.out.print("Enter Course ID: ");
//        String cID = jungkook.nextLine();
//        System.out.print("Enter Course Name: ");
//        String cName = jungkook.nextLine();
//        System.out.print("Enter Program: ");
//        String prog = jungkook.nextLine();

        studentRegistration sRegis = new studentRegistration();
        sRegis.saveStudent(new Student ("2024374071", "Quiatchon, A.", "BSIT"));
        sRegis.saveStudent(new Student ("1200014669", "Unknown", "Unknown"));
        sRegis.saveStudent(new Student ("2024777777", "Bogart", "BSM"));

        sRegis.displayAllStudent();

        sRegis.updateStudent(new Student("1200014669"));
        sRegis.removeStudent(new Student ("2024777777"));
        sRegis.displayAllStudent();

        // ----------------------------------------------------------------------------------------------------------

        courseRegistration cRegis = new courseRegistration();
        cRegis.save(new Course("INTEPROG", "Integrative Programming and Technologies", "BSIT"));
        cRegis.save(new Course("PATHFI4", "Physical Activity Towards Health and Fitness", "CITE"));
        cRegis.save(new Course("INFO", "Unknown", "Unknown"));

        cRegis.displayAll();

        cRegis.updateCourse(new Course("PATHFI"));
        cRegis.removeCourse(new Course("INFO"));
        cRegis.displayAll();
    }
}