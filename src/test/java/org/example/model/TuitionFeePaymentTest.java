package org.example.model;

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

    @Test
    void shouldReduceBalanceWhenPaymentIsMade() {
        tuiFeePayment.calculateTuitionFee(20, 20);
        double paymentAmount = 5000.00;
        double expRemaining = 11000.00;
        tuiFeePayment.makePayment(paymentAmount);

        assertEquals(expRemaining, tuiFeePayment.getRemainingBalance(), 0.001);
    }

    @Test
    void shouldReturnTrueWhenBalanceIsFullyPaid() {
        tuiFeePayment.calculateTuitionFee(10, 0); // Sets balance to 10000.0
        tuiFeePayment.makePayment(10000.00);
        boolean result = tuiFeePayment.isFullyPaid();

        assertEquals(true, result, "The student should be marked as fully paid.");
    }

}