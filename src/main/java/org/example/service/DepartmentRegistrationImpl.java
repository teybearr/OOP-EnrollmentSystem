package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;

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
}
