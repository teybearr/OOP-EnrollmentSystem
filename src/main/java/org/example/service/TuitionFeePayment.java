package org.example.service;

import org.example.model.Student;

public class TuitionFeePayment {
    private final double PRICE_PER_UNIT = 1000;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee (int units, double discountRate){
        if (units <= 0) throw new IllegalArgumentException("Units can't be negative");
        if (discountRate < 0 || discountRate > 1) throw new IllegalArgumentException("Discount rate should be between 0 and 1");

        totalTuition = units * PRICE_PER_UNIT;
        if (discountRate!=0){
            totalTuition = totalTuition - (totalTuition * discountRate);
        }
        balance = totalTuition;
        return totalTuition;
    }

    public void makePayment (double amount){
        if (amount <= 0) throw new IllegalArgumentException("Payment can't be negative numbers");
        if (amount > balance) throw new IllegalArgumentException("Payment exceeds remaining balance");
        balance -= amount;
    }

    public double getRemainingBalance(){
        return balance;
    }

    public boolean isFullyPaid(){
        return Math.abs(balance) < 0.001;
    }

    public double getDiscountRate(Student student) {
        switch (student.getScholarshipType()) {
            case "FULL":
                return 1.0;
            case "PARTIAL":
                return 0.5;
            default:
                return 0.0;
        }
    }
}