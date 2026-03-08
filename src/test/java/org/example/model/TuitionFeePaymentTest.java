package org.example.model;

import org.example.service.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    private TuitionFeePayment tuiFeePayment;

    @BeforeEach
    void setup(){
        tuiFeePayment = new TuitionFeePayment();
    }

    @Test
    void shouldGetTotalWithCorrectDiscount(){
        double actTest1 = tuiFeePayment.calculateTuitionFee(20, 20);
        assertEquals(16000.00, actTest1, 0.001);
    }

}