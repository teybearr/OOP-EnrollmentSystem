package org.example;

import org.example.model.*;
import org.example.service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jungkook = new Scanner(System.in);

        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();
        InstructorRegistrationImpl instructorRegistration = new InstructorRegistrationImpl();
        DepartmentRegistrationImpl departmentRegistration = new DepartmentRegistrationImpl();
        DataInitz.init(departmentRegistration);

        Registrar registrar = new Registrar(studentRegistration, courseRegistration, instructorRegistration, departmentRegistration);
        TuitionFeePayment tfPayment = new TuitionFeePayment();

        while (true) {
            System.out.println("\nWelcome to KATS SCHOOL REGISTRATION SYSTEM");
            System.out.println("[1] Student Registration\n[2] Course Registration\n[3] Instructor Registration\n[4] View Departments\n[5] Tuition Fee Payment\n[0] Exit");
            System.out.print("What do you want to do?: ");
            int choiceRegis = getIntInput(jungkook);

            while (true) {
                switch (choiceRegis) {
                    case 1: // student registration
                        boolean sRun = true;
                        while (sRun) {
                            System.out.println("\n-- STUDENT REGISTRATION --");
                            System.out.println("[1] Save Student\n[2] Display Student\n[3] Update Student\n[4] Delete Student\n[5] Enroll Student in Section\n[6] Exit");
                            System.out.print("What do you want to do?: ");
                            int sChoice = getIntInput(jungkook);
                            switch (sChoice) {
                                case 1: // student registration: create
                                    System.out.print("Enter Student ID: ");
                                    int sId = getIntInput(jungkook);
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
                                    int updStuId = getIntInput(jungkook);

                                    registrar.updateStudent(new Student(updStuId));
                                    break;
                                case 4: // student registration: delete
                                    System.out.print("Enter Student ID to remove: ");
                                    int remStuId = getIntInput(jungkook);

                                    System.out.println(registrar.removeStudent(new Student(remStuId)));
                                    break;
                                case 5: // student registration: enroll tos ection
                                    System.out.print("Enter Student ID: ");
                                    int enrStuId = getIntInput(jungkook);
                                    jungkook.nextLine();
                                    System.out.print("Enter Section Name: ");
                                    String enrSecName = jungkook.nextLine();

                                    Student foundStu = registrar.findStudent(enrStuId); // find actual student
                                    Section enrSec = registrar.findSection(enrSecName);

                                    if (foundStu == null) {
                                        System.out.println("Student not found.");
                                    } else if (enrSec == null) {
                                        System.out.println("Section not found.");
                                    } else {
                                        try {
                                            registrar.enrollStudentToSection(foundStu, enrSec);
                                        } catch (FullSectionExc e) {
                                            System.out.println("ERROR: " + e.getMessage());
                                        }
                                    }
                                    break;
                                case 6: // student registration: exit
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
                            int cChoice = getIntInput(jungkook);
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
                            System.out.println("[1] Add Instructor\n[2] Assign Instructor to Section\n[3] Get Instructor Details\n[4] Exit");
                            System.out.print("What do you want to do?: ");
                            int iChoice = getIntInput(jungkook);
                            switch (iChoice) {
                                case 1: // instructor registration: create
                                    System.out.print("Enter Instructor ID: ");
                                    int iId = getIntInput(jungkook);
                                    jungkook.nextLine();
                                    System.out.print("Enter Instructor Name: ");
                                    String iName = jungkook.next();
                                    jungkook.nextLine();
                                    System.out.print("Enter handling course: ");
                                    String iCourse = jungkook.next();
                                    jungkook.nextLine();

                                    registrar.addInstructor(new Instructor(iId, iName, iCourse));
                                    break;
                                case 2: // instructor registration: add to section
                                    System.out.print("Enter Instructor ID: ");
                                    int iId2 = getIntInput(jungkook);
                                    jungkook.nextLine();
                                    System.out.print("Enter Section Name: ");
                                    String iSecName = jungkook.next();
                                    Section foundsec = registrar.findSection(iSecName);
                                    if (foundsec == null) {
                                        System.out.println("No Section found");
                                    } else {
                                        registrar.assignInstructorToSection(new Instructor(iId2), foundsec);
                                    }
                                    break;
                                case 3: // instructor registration: get deets
                                    System.out.print("Enter Instructor ID: ");
                                    int deetInsId = getIntInput(jungkook);
                                    registrar.getInstructorDetails(deetInsId);

                                    break;
                                case 4: // instructor registration: exit
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
                            int dChoice = getIntInput(jungkook);
                            switch (dChoice) {
                                case 1: // department viewing: add section to dept
                                    jungkook.nextLine();
                                    System.out.print("Enter Department ID to add section to: ");
                                    String secDepId = jungkook.nextLine();
                                    System.out.print("Enter Section Name: ");
                                    String secName = jungkook.nextLine();
                                    System.out.print("Enter Max Capacity: ");
                                    int secCap = getIntInput(jungkook);
                                    System.out.print("Enter Instructor ID for this section (0 if none): ");
                                    int secInsId = getIntInput(jungkook);

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
                            int tfChoice = getIntInput(jungkook);
                            switch (tfChoice) {
                                case 1: // tuition fee calculator: calculate
                                    System.out.print("Enter number of units: ");
                                    int units = getIntInput(jungkook);
                                    System.out.print("Enter discount rate (0 if none, e.g. 0.10 for 10%): ");
                                    double discount = getDoubleInput(jungkook);
                                    double tuition = tfPayment.calculateTuitionFee(units, discount);
                                    System.out.println("Total Tuition Fee: " + tuition);
                                    break;
                                case 2: // tuition fee calculator: pay
                                    System.out.print("Enter payment amount: ");
                                    double amount = getDoubleInput(jungkook);
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
                    case 0:
                        System.out.println("Thank you for using KATS SCHOOL REGISTRATION! Exiting now...");
                        System.exit(0);
                        break;
                    default: // mali mo
                        System.out.println("Please choose between 0 to 5 ONLY.");
                        break;
                }
                break;
            }
            System.out.print("Do you want to continue with the service or Exit? ([0] Exit, [1] Continue): ");
            int doneNaBa = getIntInput(jungkook);
            if (doneNaBa == 0) {
                System.out.println("Thank you for using KATS SCHOOL REGISTRATION! Exiting now...");
                break;
            }
        }
    }
    public static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                int val = scanner.nextInt();
                return val;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
    public static double getDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double val = scanner.nextDouble();
                return val;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}