package org.example;
import org.example.service.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers(){
        //Act
        calculator.sum(10, 5);
        // Assert
        assertEquals(15, calculator.getAnswer());
    }

    @Test
    void shouldSubtractTwoNumbers(){
        //Act
        calculator.diff(20, 10);
        // Assert
        assertEquals(10, calculator.getAnswer());
    }
}