package org.example.service;

public class TuitionFeePayment {
    private final double PRICE_PER_UNIT = 1000;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee (int units, double discountRate){
        totalTuition = units * PRICE_PER_UNIT;
        if (discountRate!=0){
            totalTuition = totalTuition - (totalTuition * discountRate);
        }
        //this.balance += totalTuition;
        return totalTuition;
    }

    public void makePayment (double amount){
        this.balance = this.balance-amount;
        System.out.printf("Payment of P%.2f received!", amount);
    }

    public double getRemainingBalance(){
        return this.balance;
    }

    public boolean isFullyPaid(){
        if (this.balance <= 0){
            return true;
        } else {
            return false;
        }
    }
}