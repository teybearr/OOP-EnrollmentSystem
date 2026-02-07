package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner (System.in);

        System.out.print("Enter Student ID: ");
        String id = jungkook.nextLine();
        System.out.print("Enter Student Name: ");
        String name = jungkook.nextLine();
        System.out.print("Enter Course ID: ");
        String cID = jungkook.nextLine();
        System.out.print("Enter Course Name: ");
        String cName = jungkook.nextLine();
        System.out.print("Enter Program: ");
        String prog = jungkook.nextLine();

        Student s = new Student();
        s.setStudentID(id);
        s.setStudentName(name);
        s.setProgram(prog);
        System.out.println("\nStudent ID: " + s.getStudentID());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Program: " + s.getProgram());

//        s.setStudentID("1200014669");
//        s.setStudentName("Wreign Hizon");
//        s.setProgram("BSIT");
//        System.out.println("Student ID: " + s.getStudentID());
//        System.out.println("Student Name: " + s.getStudentName());
//        System.out.println("Program: " + s.getProgram());
//        System.out.println("------------------------------------------------------------");
        Course c = new Course();
        c.setCourseID(cID);
        c.setCourseName(cName);
        c.setProgram(prog);
        System.out.println("\nCourse ID: " + c.getCourseID());
        System.out.println("Course Name: " + c.getCourseName());
        System.out.println("Program: " + c.getProgram());
//        c.setCourseID("INTEPROG");
//        c.setCourseName("Integrative Programming and Technologies");
//        c.setProgram("BSIT");
//        System.out.println("Course ID: " + c.getCourseID());
//        System.out.println("Course Name: " + c.getCourseName());
//        System.out.println("Program: " + c.getProgram());
    }
}