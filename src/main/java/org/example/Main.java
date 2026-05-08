package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner(System.in);

        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();
        InstructorRegistrationImpl instructorRegistration = new InstructorRegistrationImpl();
        DepartmentRegistrationImpl departmentRegistration = new DepartmentRegistrationImpl();
        Registrar registrar = new Registrar(studentRegistration, courseRegistration, instructorRegistration, departmentRegistration);
        TuitionFeePayment tfPayment = new TuitionFeePayment();

        Department CSDep = new Department("CS", "Computer Science", new ArrayList<>());
        Section C2ASec = new Section("C2A", 35, null);
        Section C2BSec = new Section("C2B", 30, null);
        CSDep.getSectionList().add(C2ASec);
        CSDep.getSectionList().add(C2BSec);

        Department ITDep = new Department("IT", "Information Technology", new ArrayList<>());
        Section IT2ASec = new Section("IT2A", 35, null);
        Section IT2BSec = new Section("IT2B", 35, null);
        Section IT2CSec = new Section("IT2C", 35, null);
        ITDep.getSectionList().add(IT2ASec);
        ITDep.getSectionList().add(IT2BSec);
        ITDep.getSectionList().add(IT2CSec);

        Department ACTDep = new Department("ACT", "Associate in Computer Technology", new ArrayList<>());
        Section ACT2ASec = new Section("ACT2A", 25, null);
        ACTDep.getSectionList().add(ACT2ASec);

        while (true) {
            System.out.println("\nWelcome to KATS SCHOOL REGISTRATION SYSTEM");
            System.out.println("[1] Student Registration\n[2] Course Registration\n[3] Instructor Registration\n[4] View Departments\n[5] Tuition Fee Payment");
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

                                    try {
                                        registrar.saveStudent(new Student(sId, sName, sProg));
                                    } catch (DupliStudIDExc e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
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
                    case 3: // instructor registration
                        boolean iRun = true;
                        while (iRun) {
                            System.out.println("\n-- INSTRUCTOR REGISTRATION --");
                            System.out.println("[1] Save Instructor\n[2] Display Instructor\n[3] Update Instructor\n[4] Delete Instructor\n[5] Exit");
                            System.out.print("What do you want to do?: ");
                            int iChoice = jungkook.nextInt();
                            switch (iChoice) {
                                case 1: // instructor registration: create
                                    System.out.print("Enter Instructor ID: ");
                                    int iId = jungkook.nextInt();
                                    jungkook.nextLine();
                                    System.out.print("Enter Instructor Name: ");
                                    String iName = jungkook.next();
                                    jungkook.nextLine();
                                    System.out.print("Enter handling course: ");
                                    String iCourse = jungkook.next();
                                    jungkook.nextLine();

                                    registrar.saveInstructor(new Instructor(iId, iName, iCourse));
                                    break;
                                case 2: // instructor registration: read
                                    registrar.displayAllInstructor();
                                    break;
                                case 3: // instructor registration: update
                                    System.out.print("Enter Instructor ID to update: ");
                                    int updInsId = jungkook.nextInt();

                                    registrar.updateInstructor(new Instructor(updInsId));
                                    break;
                                case 4: // instructor registration: delete
                                    System.out.print("Enter Instructor ID to remove: ");
                                    int remInsId = jungkook.nextInt();

                                    System.out.println(registrar.removeInstructor(new Instructor(remInsId)));
                                    break;
                                case 5: // instructor registration: exit
                                    iRun = false;
                                    break;
                                default: // instructor registration: mali mo
                                    System.out.println("Please enter a number from 1 to 5 only");
                                    break;
                            }
                        }
                        break;
                    case 4: // viewing departments
                        boolean dRun = true;
                        while (dRun) {
                            System.out.println("\n-- DEPARTMENT VIEWING --");
                            System.out.println("[1] Add Section to a Department\n[2] View Department Hierarchy\n[3] Exit");
                            System.out.print("What do you want to do?: ");
                            int dChoice = jungkook.nextInt();
                            switch (dChoice) {
                                case 1: // department viewing: add section to dept
                                    jungkook.nextLine();
                                    System.out.print("Enter Department ID to add section to: ");
                                    String secDepId = jungkook.nextLine();
                                    System.out.print("Enter Section Name: ");
                                    String secName = jungkook.nextLine();
                                    System.out.print("Enter Max Capacity: ");
                                    int secCap = jungkook.nextInt();
                                    System.out.print("Enter Instructor ID for this section (0 if none): ");
                                    int secInsId = jungkook.nextInt();

                                    Instructor secInstructor = null;
                                    if (secInsId != 0) { secInstructor = new Instructor(secInsId); }
                                    registrar.addSectiontoDept(secDepId, new Section(secName, secCap, secInstructor));
                                    break;
                                case 2: // department viewing: view
                                    registrar.displayHierarchy();
                                    break;
                                case 3: // department registration: exit
                                    dRun = false;
                                    break;
                                default: // department viewing: mali mo
                                    System.out.println("Please enter a number from 1 to 3 only");
                                    break;
                            }
                        }
                        break;
                    case 5: // tuition fee calculator
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
                        System.out.println("Please choose between 1 to 5 ONLY.");
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