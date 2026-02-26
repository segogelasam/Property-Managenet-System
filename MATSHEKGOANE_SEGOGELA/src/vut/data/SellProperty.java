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
public class SellProperty extends Property {
      private double sellingPrice;
      
      public SellProperty(){}

    public SellProperty(String propertyCode, String estateAgent, double sellingPrice) {
        super(propertyCode, estateAgent);
        setSellingPrice(sellingPrice);
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice < 0) {
            throw new IllegalArgumentException("The Price can't be negative");
        }
        this.sellingPrice = sellingPrice;
    }

    private double calculateTax() {
        if (sellingPrice < 500000) {
            return 0;
        } else if (sellingPrice <= 1000000) {
            return sellingPrice * 0.1;
        } else {
            return sellingPrice * 0.15;
        }
    }

    @Override
    public double calculateAmountPayable() {
        return sellingPrice + calculateTax();
    }

    @Override
    public double calculateCommission(double percentage) {
        return calculateAmountPayable() * (percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("%s R%.2f", super.toString(), sellingPrice);
    }
}
