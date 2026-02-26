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
public interface Calculable {
    
    enum PropertyType{
        RENTING,SELLING
    }
    
    double calculateAmountPayable();
    double calculateCommission(double percentage);
}
