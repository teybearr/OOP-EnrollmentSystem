package org.example.model;

import org.example.service.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrarTest {

    private Registrar registrar;

    @BeforeEach
    void setUp() {
        StudentRegistrationImpl studentService = new StudentRegistrationImpl();
        InstructorRegistrationImpl instructorService = new InstructorRegistrationImpl();
        CourseRegistrationImpl courseService = new CourseRegistrationImpl();
        DepartmentRegistrationImpl departmentService = new DepartmentRegistrationImpl();

        registrar = new Registrar(studentService, courseService, instructorService, departmentService);
    }

    @Test
    @DisplayName("Enroll Student to a Full Section")
    void shouldFailToEnrollWhenSectionIsFull() {
        Section testSection = new Section("IT2C", 2);
        Student student1 = new Student(202601, "Sean", "BSIT");
        Student student2 = new Student(202602, "Editha", "BSIT");
        Student student3 = new Student(202603, "John Doe", "BSIT");

        assertDoesNotThrow(() -> registrar.enrollStudentToSection(student1, testSection));
        assertDoesNotThrow(() -> registrar.enrollStudentToSection(student2, testSection));

        assertThrows(FullSectionExc.class, () -> registrar.enrollStudentToSection(student3, testSection),
                "The system allowed a student to enroll in a full section!");
        assertEquals(2, testSection.getEnrolledStuds().size(), "Section size should remain 2.");
    }

    @Test
    @DisplayName("Enroll Student to a Section w/ Space")
    void shouldSuccessfullyEnrollWhenSectionHasSpace() {
        Section testSection = new Section("IT2C", 30);
        Student student1 = new Student(202601, "Theo", "BSIT");

        assertDoesNotThrow(() -> registrar.enrollStudentToSection(student1, testSection));
        assertEquals(1, testSection.getEnrolledStuds().size());
    }

    @Test
    @DisplayName("Save Student w/ Duplicate ID")
    void shouldThrowExceptionOnDuplicateStudentID() throws DupliStudIDExc {
        Student s1 = new Student(202601, "Dev", "BSCS");
        registrar.saveStudent(s1);

        Student duplicate = new Student(202601, "Wreign", "BSIT");
        assertThrows(DupliStudIDExc.class, () -> registrar.saveStudent(duplicate),
                "System should reject duplicate student ID.");
    }

    @Test
    @DisplayName("Assign Instructor to Section")
    void shouldAssignInstructorToSection() {
        Instructor instructor = new Instructor(2026101, "Sir Kim", "INFASEC");
        Section section = new Section("IT1A", 30);

        registrar.assignInstructorToSection(instructor, section);

        assertEquals(instructor, section.getInstructor(), "Section should have Sir Kim assigned.");
        assertEquals(1, instructor.getAssignedSections().size(), "Instructor should have 1 assigned section.");
    }
}