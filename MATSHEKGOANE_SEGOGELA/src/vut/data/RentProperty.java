/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author 223092274
 */
public class RentProperty extends Property{
    private double rentAmount;
    private int contractDuration;
    
    public RentProperty(){}

    public RentProperty(String propertyCode, String estateAgent, double rentAmount, int contractDuration) {
        super(propertyCode, estateAgent);
        setRentAmount(rentAmount);
        this.contractDuration = contractDuration;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        if (rentAmount < 0) {
            throw new IllegalArgumentException("The Amount can't be negative");
        }
        this.rentAmount = rentAmount;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public double calculateAmountPayable() {
        return rentAmount * contractDuration;
    }

    @Override
    public double calculateCommission(double percentage) {
        double commission = rentAmount * (percentage / 100);
        if (getPropertyCode().charAt(1) > '2') {
            commission += 2.5;
        }
        return commission;
    }

    @Override
    public String toString() {
        return String.format("%s R%.2f %d months", super.toString(), rentAmount, contractDuration);
    }
}
