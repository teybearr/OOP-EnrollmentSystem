package org.example;

import org.example.model.Course;
import org.example.model.Registrar;
import org.example.model.Student;
import org.example.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner(System.in);

        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();
        DepartmentRegistrationImpl departmentRegistration = new DepartmentRegistrationImpl();
        Registrar registrar = new Registrar(studentRegistration, courseRegistration, departmentRegistration);

        while (true) {
            System.out.println("\nWelcome to KATS SCHOOL REGISTRATION");
            System.out.println("[1] Student Registration\n[2] Course Registration\n[3] Department Registration\n[4] Tuition Fee Payment");
            System.out.print("What do you want to do?: ");
            int choiceRegis = jungkook.nextInt();

            while (true) {
                switch (choiceRegis) {
                    case 1: // student registration
                        boolean sRun = true;
                        while (sRun) {
                            System.out.println("\n-- STUDENT REGISTRATION --");
                            System.out.println("[1] Save Student\n[2] Display Student\n[3] Update Student\n[4] Delete Student\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int sChoice = jungkook.nextInt();
                            switch (sChoice) {
                                case 1: // student registration: create
                                    System.out.print("Enter Student ID: ");
                                    int sId = jungkook.nextInt();
                                    System.out.print("Enter Student Name: ");
                                    String sName = jungkook.next();
                                    System.out.print("Enter Program: ");
                                    String sProg = jungkook.next();

                                    registrar.saveStudent(new Student(sId, sName, sProg));
                                    break;
                                case 2: // student registration: read
                                    registrar.displayAllStudent();
                                    break;
                                case 3: // student registration: update
                                    System.out.print("Enter Student ID to update: ");
                                    int updStuId = jungkook.nextInt();

                                    registrar.updateStudent(new Student(updStuId));
                                    break;
                                case 4: // student registration: delete
                                    System.out.print("Enter Student ID to remove: ");
                                    int remStuId = jungkook.nextInt();

                                    System.out.println(registrar.removeStudent(new Student(remStuId)));
                                    break;
                                case 5: // student registration: exit
                                    sRun = false;
                                    break;
                                default: // student registration: mali mo
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 2: // course registration
                        boolean cRun = true;
                        while (cRun) {
                            System.out.println("\n-- COURSE REGISTRATION --");
                            System.out.println("[1] Save Course\n[2] Display Course\n[3] Update Course\n[4] Delete Course\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int cChoice = jungkook.nextInt();
                            switch (cChoice) {
                                case 1: // course registration: create
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
                                case 2: // course registration: read
                                    registrar.displayAll();
                                    break;
                                case 3: // course registration: update
                                    System.out.print("Enter Course ID to update: ");
                                    String updCouId = jungkook.next();

                                    registrar.updateCourse(new Course(updCouId));
                                    break;
                                case 4: // course registration: delete
                                    System.out.print("Enter Course ID to remove: ");
                                    String remCouId = jungkook.next();

                                    System.out.println(registrar.removeCourse(new Course(remCouId)));
                                    break;
                                case 5: // course registration: exit
                                    cRun = false;
                                    break;
                                default: // course registration: mali mo
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 3: // department registration
                        boolean dRun = true;
                        while (dRun) {
                            System.out.println("\n-- DEPARTMENT REGISTRATION --");
                            System.out.println("[1] Save Department\n[2] Display Department\n[3] Update Department\n[4] Delete Department\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int dChoice = jungkook.nextInt();
                            switch (dChoice) {
                                case 1: // department registration: create
                                    jungkook.nextLine();
                                    System.out.print("Enter Department ID: ");
                                    String dId = jungkook.nextLine();
                                    System.out.print("Enter Department Name: ");
                                    String dName = jungkook.nextLine();

                                    registrar.saveDepartment(dId, dName, new java.util.ArrayList<>());
                                    break;
                                case 2: // department registration: read
                                    registrar.displayAllDep();
                                    break;
                                case 3: // department registration: update
                                    jungkook.nextLine(); // clear buffer
                                    System.out.print("Enter Department ID to update: ");
                                    String updDepId = jungkook.nextLine();

                                    registrar.updateDepartment(updDepId);
                                    break;
                                case 4: // department registration: delete
                                    System.out.print("Enter Department ID to remove: ");
                                    String remDepId = jungkook.nextLine();

                                    System.out.println(registrar.removeDepartment(remDepId));
                                    break;
                                case 5: // department registration: exit
                                    dRun = false;
                                    break;
                                default: // department registration: mali mo
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 4: // tuition fee calculator
                        TuitionFeePayment tfPayment = new TuitionFeePayment();
                        boolean tfRun = true;
                        while (tfRun) {
                            System.out.println("\n-- TUITION FEE PAYMENT --");
                            System.out.println("[1] Calculate Tuition Fee\n[2] Make Payment\n[3] See Remaining Balance\n[4] Check if Fully Paid\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int tfChoice = jungkook.nextInt();
                            switch (tfChoice) {
                                case 1: // tuition fee calculator: calculate
                                    System.out.print("Enter number of units: ");
                                    int units = jungkook.nextInt();
                                    System.out.print("Enter discount rate (0 if none, e.g. 0.10 for 10%): ");
                                    double discount = jungkook.nextDouble();
                                    double tuition = tfPayment.calculateTuitionFee(units, discount);
                                    System.out.println("Total Tuition Fee: " + tuition);
                                    break;
                                case 2: // tuition fee calculator: pay
                                    System.out.print("Enter payment amount: ");
                                    double amount = jungkook.nextDouble();
                                    tfPayment.makePayment(amount);
                                    System.out.println("Payment made!");
                                    break;
                                case 3: // tuition fee calculator: read remaining balance
                                    System.out.println("Remaining Balance: " + tfPayment.getRemainingBalance());
                                    break;
                                case 4: // tuition fee calculator: fully paid
                                    System.out.println("Fully Paid: " + tfPayment.isFullyPaid());
                                    break;
                                case 5: // tuition fee calculator: exit
                                    tfRun = false;
                                    break;
                                default: // tuition fee calculator: mali mo
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    default: // mali mo
                        System.out.println("Please choose between 1 to 4 ONLY.");
                        break;
                }
                break;
            }
            System.out.print("Do you want to continue with the service or Exit? ([0] Exit, [1] Continue): ");
            int doneNaBa = jungkook.nextInt();
            if (doneNaBa == 0) {
                System.out.println("Thank you for using KATS SCHOOL REGISTRATION! Exiting now...");
                break;
            }
        }
    }
}