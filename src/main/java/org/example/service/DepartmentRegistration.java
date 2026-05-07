package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;

import java.util.List;

public interface DepartmentRegistration {
    void saveDepartment (String id, String departmentName, List<Instructor> instructorList);
    List<Department> displayAllDep ();
    void updateDepartment(String id);
    String removeDepartment(String id);
}
