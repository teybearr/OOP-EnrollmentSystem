package org.example.model;

public class TuitionFeePayment {
    private double pricePerUnit = 1000;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee (int units, double discountRate){
        double total = units*pricePerUnit;
        double decimalDisc = discountRate/100;
        double totalTuition = total-(decimalDisc*total);
        this.balance += totalTuition;
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
        if (this.balance <= 0){ return true;
        } else { return false; }
    }
}