package org.example.model;

import org.example.service.StudentRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class RegistrarTest {

    @Mock
    StudentRegistration studentRegistration;

    @InjectMocks
    Registrar registrar;

    @Test
    void testRegistrar() {
        Student s1 = new Student(202601, "Sean", "BSIT");
        String result = registrar.saveStudent(s1);

        assertEquals("Successfully added!", result);

        verify(studentRegistration).saveStudent(s1);
    }
}