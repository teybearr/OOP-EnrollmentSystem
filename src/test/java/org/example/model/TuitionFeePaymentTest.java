package org.example.model;

import org.example.service.TuitionFeePayment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    private TuitionFeePayment tuiFeePayment;

    @BeforeEach
    void setup(){
        tuiFeePayment = new TuitionFeePayment();
    }

    @Test
    @DisplayName("Calculation of Tuition Fee w/o")
    void shouldGetTotalTuitionFeeWithNoDiscount(){
        assertEquals(3000.00, tuiFeePayment.calculateTuitionFee(3, 0));
    }

    @Test
    @DisplayName("Calculation of Tuition Fee w/ Discount")
    void shouldGetTotalTuitionFeeWithTenPercentDiscount(){
        assertEquals(2700.00, tuiFeePayment.calculateTuitionFee(3, 0.10));
    }

    @Test
    @DisplayName("Pay Tuition Fee")
    void shouldMakePayment() {
        tuiFeePayment.calculateTuitionFee(3,0.10);
        tuiFeePayment.makePayment(1000);

        assertEquals(1700, tuiFeePayment.getRemainingBalance());
    }

    @Test
    @DisplayName("Is Not Fully Paid")
    void shouldReturnFalseIfNotFullyPaid() {
        tuiFeePayment.calculateTuitionFee(3, 0.10);
        tuiFeePayment.makePayment(1000);

        assertFalse(tuiFeePayment.isFullyPaid());
    }

    @Test
    @DisplayName("Is Fully Paid")
    void shouldReturnTrueIfFullyPaid() {
        tuiFeePayment.calculateTuitionFee(3, 0.10);
        tuiFeePayment.makePayment(2700);

        assertTrue(tuiFeePayment.isFullyPaid());
    }
}