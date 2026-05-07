package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentRegistrationImpl implements DepartmentRegistration {
    private Scanner jungkook = new Scanner(System.in);
    List<Department> departments;
    List<Instructor> instructorList;

    public DepartmentRegistrationImpl(){
        this.departments = new ArrayList<>();
        this.instructorList = new ArrayList<>();
    }

    public void saveDepartment (String id, String departmentName, List<Instructor> instructorList){
        departments.add(new Department(id, departmentName, instructorList));
        System.out.println("Successfully added!");
    }

    public void updateDepartment(String id) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId().equals(id)) {
                System.out.print("Enter new Department Name: ");
                String updDepName = jungkook.nextLine();

                departments.get(i).setName(updDepName);
                System.out.println("Successfully updated!");
                return;
            }
        }
        System.out.println("Department not found.");
    }

    public String removeDepartment(String id) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId().equals(id)) {
                departments.remove(i);
                return "Successfully removed department!";
            }
        }
        return "Department not found.";
    }

    public List<Department> displayAllDep (){
        return departments.stream().toList();
    }

    public void addSectiontoDept(String departmentId, Section section) {
        for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            if (d.getId().equals(departmentId)) {
                d.getSectionList().add(section);
                System.out.println("Section added to department!");
                return;
            }
        }
        System.out.println("Department not found");
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayHierarchy() {
        if (departments.isEmpty()) {
            System.out.println("Department not found");
            return;
        }
        for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            System.out.println("\n DEPARTMENT: " + d.getName() + " (ID: " + d.getId() + ")");

            if (d.getSectionList().isEmpty()) {
                System.out.println("Sections not found");
            } else {
                for (int h = 0; h < d.getSectionList().size(); h++) {
                    Section s = d.getSectionList().get(h);
                    System.out.println(" > SECTION: " + s.getSectionName() + " | Capacity: " + s.getMaxCapacity());

                    if (s.getInstructor() != null) {
                        System.out.println(" >> INSTRUCTOR: " + s.getInstructor().getName() + " (ID: " + s.getInstructor().getID() + ")");
                    } else {
                        System.out.println(" >> INSTRUCTOR: No instructor assigned");
                    }

                    if (s.getEnrolledStuds().isEmpty()) {
                        System.out.println(" >> STUDENTS: No Students enrolled");
                    } else {
                        System.out.println(" >> STUDENTS: ");
                        for (int j = 0; j < s.getEnrolledStuds().size(); j++) {
                            Student stud = s.getEnrolledStuds().get(i);
                            System.out.println("    - " + stud.getName() + " (ID: " + stud.getID() + ")");
                        }
                    }
                }
            }
        }
    }
}
