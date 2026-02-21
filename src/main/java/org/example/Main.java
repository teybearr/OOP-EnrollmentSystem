package org.example;

import org.example.model.Course;
import org.example.model.Student;

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

        Student s1 = new Student();
        s1.setStudentID("2024374071");
        s1.setStudentName("Althea Quiatchon");
        s1.setProgram("BSIT");
        s1.displayStudent();

        Student s2 = new Student();
        s2.setStudentID("1200014669");
        s2.setStudentName("Wreign Hizon");
        s2.setProgram("BSIT");
        s2.displayStudent();

        Course c = new Course();
        c.setCourseID("INTEPROG");
        c.setCourseName("Integrative Programming and Technologies");
        c.setProgram("BSIT");
        c.displayCourse();
    }
}