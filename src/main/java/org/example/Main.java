package org.example;

import org.example.model.Course;
import org.example.model.Registrar;
import org.example.model.Student;
import org.example.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner(System.in);
        while (true) {
            StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
            CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();
            DepartmentRegistrationImpl departmentRegistration = new DepartmentRegistrationImpl();

            Registrar registrar = new Registrar(studentRegistration, courseRegistration, departmentRegistration);

            System.out.println("\nWelcome to KATS SCHOOL REGISTRATION");
            System.out.println("[1] Student Registration\n[2] Course Registration\n[3] Department Registration\n[4] Tuition Fee Payment");
            System.out.print("What do you want to do?: ");
            int choiceRegis = jungkook.nextInt();

            while (true) {
                switch (choiceRegis) {
                    case 1:
                        boolean sRun = true;
                        while (sRun) {
                            System.out.println("\n-- STUDENT REGISTRATION --");
                            System.out.println("[1] Save Student\n[2] Display Student\n[3] Update Student\n[4] Delete Person\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int sChoice = jungkook.nextInt();
                            switch (sChoice) {
                                case 1:
                                    System.out.print("Enter Student ID: ");
                                    int sId = jungkook.nextInt();
                                    System.out.print("Enter Student Name: ");
                                    String sName = jungkook.next();
                                    System.out.print("Enter Program: ");
                                    String sProg = jungkook.next();

                                    registrar.saveStudent(new Student(sId, sName, sProg));
                                    break;
                                case 2:
                                    registrar.displayAllStudent();
                                    break;
                                case 3:
                                    System.out.print("Enter Student ID to update: ");
                                    int updStuId = jungkook.nextInt();

                                    registrar.updateStudent(new Student(updStuId));
                                    break;
                                case 4:
                                    System.out.print("Enter Student ID to remove: ");
                                    int remStuId = jungkook.nextInt();

                                    System.out.println(registrar.removeStudent(new Student(remStuId)));
                                    break;
                                case 5:
                                    sRun = false;
                                    break;
                                default:
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        boolean cRun = true;
                        while (cRun) {
                            System.out.println("\n-- COURSE REGISTRATION --");
                            System.out.println("[1] Save Course\n[2] Display Course\n[3] Update Course\n[4] Delete Course\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int cChoice = jungkook.nextInt();
                            switch (cChoice) {
                                case 1:
                                    System.out.print("Enter Course ID: ");
                                    String cID = jungkook.next();
                                    jungkook.nextLine();
                                    System.out.print("Enter Course Name: ");
                                    String cName = jungkook.next();
                                    jungkook.nextLine();
                                    System.out.print("Enter Program: ");
                                    String cProg = jungkook.next();
                                    jungkook.nextLine();

                                    registrar.save(new Course(cID, cName, cProg));
                                    break;
                                case 2:
                                    registrar.displayAll();
                                    break;
                                case 3:
                                    System.out.print("Enter Course ID to update: ");
                                    String updCouId = jungkook.next();

                                    registrar.updateCourse(new Course(updCouId));
                                    break;
                                case 4:
                                    System.out.print("Enter Course ID to remove: ");
                                    String remCouId = jungkook.next();

                                    System.out.println(registrar.removeCourse(new Course(remCouId)));
                                    break;
                                case 5:
                                    cRun = false;
                                    break;
                                default:
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        boolean dRun = true;
                        while (dRun) {
                            System.out.println("\n-- DEPARTMENT REGISTRATION --");
                            System.out.println("[1] Save Student\n[2] Display Student\n[3] Update Student\n[4] Delete Person\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int dChoice = jungkook.nextInt();
                            switch (dChoice) {
                                case 1:
//                                    System.out.print("Enter Department ID: ");
//                                    int dId = jungkook.nextInt();
//                                    System.out.print("Enter Department Name: ");
//                                    int dName = jungkook.nextInt();
//
//                                    registrar.saveDepartment(new Student(dId, dName));
                                    break;
                                case 2:
                                    registrar.displayAllDep();
                                    break;
                                case 5:
                                    dRun = false;
                                    break;
                                default:
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
//                    case 4:
//                        TuitionFeePayment tfPayment = new TuitionFeePayment();
//                        boolean tfRun = true;
//                        while (tfRun) {
//                            System.out.println("\n-- TUITION FEE PAYMENT --");
//                            System.out.println("[1] Calculate Tuition Fee\n[2] Make Payment\n[3] See Remaining Balance\n[4] See if Fully Paid\n[5] Exit");
//                            System.out.print("What do you want to do?: ");
//                            int tfChoice = jungkook.nextInt();
//                            switch (tfChoice) {
//                                case 1:
//                                    System.out.print("Enter Course ID: ");
//                                    int cID = jungkook.nextInt();
//                                    jungkook.nextLine();
//                                    System.out.print("Enter Course Name: ");
//                                    String cName = jungkook.next();
//                                    jungkook.nextLine();
//                                    System.out.print("Enter Program: ");
//                                    String cProg = jungkook.next();
//                                    jungkook.nextLine();
//
//                                    cRegis.save(new Course(cID, cName, cProg));
//                                    break;
//                                case 2:
//                                    cRegis.displayAll();
//                                    break;
//                                case 3:
//                                    System.out.print("Enter Course ID to update: ");
//                                    int updCouId = jungkook.nextInt();
//
//                                    cRegis.updateCourse(new Course(updCouId));
//                                    break;
//                                case 4:
//                                    System.out.print("Enter Course ID to remove: ");
//                                    int remCouId = jungkook.nextInt();
//
//                                    System.out.println(cRegis.removeCourse(new Course(remCouId)));
//                                    break;
//                                case 5:
//                                    tfRun = false;
//                                    break;
//                                default:
//                                    System.out.println("Please enter a number from 1 to 5 only");
//                                    break;
//                            }
//                        }
//                        }
//                        break;
                    default:
                        System.out.println("Please choose only between 1 and 2.");
                        break;
                }
                break;
            }
            System.out.print("Do you want to continue with Registration or Exit? ([0] Exit, [1] Continue): ");
            int doneNaBa = jungkook.nextInt();
            if (doneNaBa == 0) {
                System.out.println("Thank you for using KATS SCHOOL REGISTRATION! Exiting now...");
                break;
            }
        }
    }
}